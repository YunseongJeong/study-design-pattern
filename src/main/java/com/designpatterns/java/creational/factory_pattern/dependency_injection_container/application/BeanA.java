package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.application;

public class BeanA {
    BeanB b;

    public BeanA(BeanB b){
        this.b = b;
    }

    public void test(){

    }
}
