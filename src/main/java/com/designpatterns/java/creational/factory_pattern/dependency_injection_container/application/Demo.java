package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.application;

import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.application_context.ApplicationContext;
import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.application_context.ClassPathXmlApplicationContext;

// Demo 실행 클래스이다.
// DI Container로 BeanA를 불러와서 테스트를 진행한다.
public class Demo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        BeanA beanA = (BeanA) applicationContext.getBean("beanA");
        beanA.test();
    }
}
