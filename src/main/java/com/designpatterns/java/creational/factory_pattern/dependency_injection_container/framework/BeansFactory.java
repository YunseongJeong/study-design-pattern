package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// 빈들의 실제 Factory Class
public class BeansFactory {
    private ConcurrentHashMap<String, Object> singleTonObjects = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>();

    public void addBeanDefinitions(List<BeanDefinition> beanDefinitions){
        for (BeanDefinition beanDefinition : beanDefinitions){
            this.beanDefinitions.putIfAbsent(beanDefinition.getId(), beanDefinition);
        }
        for (BeanDefinition beanDefinition : beanDefinitions){
            if (beanDefinition.isLazyInit() == false && beanDefinition.isSingleton()){
                createBean(beanDefinition); // Singleton이거나 지연적재를 지원하지 않는다면 즉시 적재한다.
            }
        }
    }

    public Object getBean(String id){
        BeanDefinition beanDefinition = beanDefinitions.get(id);
        if (beanDefinition == null){
            throw new RuntimeException("Bean is not defined " + id);
        }
        return createBean(beanDefinition);
    }

    private Object createBean(BeanDefinition beanDefinition){
        if (beanDefinition.isSingleton() && singleTonObjects.contains((beanDefinition.getId()))){
            // singleton 이라 이미 저장되어있을 때
            return singleTonObjects.get(beanDefinition.getId());
        }

        Object bean = null;
        try {
            Class beanClass = Class.forName(beanDefinition.getClassName());
            List<BeanDefinition.ConstructorArgs> args = beanDefinition.getConstructorArgs();
            if (args.isEmpty()){ // 인자가 필요없는 생성자일때
                return beanClass.getDeclaredConstructor().newInstance();
            } else { // 인자가 필요할 때
                Class[] argClasses = new Class[args.size()];
                Object[] argObjects = new Object[args.size()];
                List<BeanDefinition.ConstructorArgs> args1 = beanDefinition.getConstructorArgs();
                for (int i = 0; i < args.size(); ++i){ // 인자 정보를 모음
                    BeanDefinition.ConstructorArgs arg = args.get(i);
                    if (!arg.isRef){
                        argClasses[i] = arg.type;
                        argObjects[i] = arg.arg;
                    } else {
                        BeanDefinition refBeanDefinition = beanDefinitions.get(arg.arg);
                        if (refBeanDefinition == null){
                            throw new RuntimeException("Bean is not defined: " + arg.arg);
                        }
                        argClasses[i] = Class.forName(refBeanDefinition.getClassName());
                        argObjects[i] = createBean(refBeanDefinition); // 인자를 재귀적으로 생성
                    }
                }
                // 모은 인자 정보를 가져옴
                bean = beanClass.getDeclaredConstructor(argClasses).newInstance(argObjects);
            }
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
        if (bean != null && beanDefinition.isSingleton()){
            singleTonObjects.putIfAbsent(beanDefinition.getId(), bean);
            return singleTonObjects.get(beanDefinition.getId());
        }
        return bean;
    }
}
