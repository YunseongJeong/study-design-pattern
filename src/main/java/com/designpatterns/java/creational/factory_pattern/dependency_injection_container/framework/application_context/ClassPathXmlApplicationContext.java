package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.application_context;

import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.bean_config_parser.BeanConfigParser;
import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.BeanDefinition;
import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.BeansFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// xml의 빈 설정 파일에 따라 bean에 의존성을 주입하는 DI Container이다.
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String path){
        beansFactory = new BeansFactory();
        beanConfigParser = new BeanConfigParser();
        loadBeanDefinitions(path);
    }

    private void loadBeanDefinitions(String path){
        InputStream in = null;
        try {
            in = this.getClass().getResourceAsStream("/"+ path);
            if (in == null) {
                throw new RuntimeException("Can not find config file: " + path);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e){
                    System.out.println("input Stream Can't Closed");
                }
            }
        }
    }

    @Override
    public Object getBean(String id) {
        return beansFactory.getBean(id);
    }
}
