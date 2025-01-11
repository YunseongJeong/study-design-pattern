package com.designpatterns.java.structural.proxy_pattern.based_on_inheritance;

public class DemoProxy extends Demo {
    @Override
    public void demo(){
        // 프록시에서 추가할 로직
        super.demo(); // 실제 Demo의 로직
    }
}
