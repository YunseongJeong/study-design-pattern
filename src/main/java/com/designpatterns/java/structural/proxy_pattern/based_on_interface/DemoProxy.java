package com.designpatterns.java.structural.proxy_pattern.based_on_interface;

public class DemoProxy implements IDemo{
    private final IDemo demo;
    public DemoProxy(IDemo demo){
        this.demo = demo;
    }


    @Override
    public void demo(){
        // 프록시에서 추가할 로직
        demo.demo(); // 실제 Demo의 로직
    }
}
