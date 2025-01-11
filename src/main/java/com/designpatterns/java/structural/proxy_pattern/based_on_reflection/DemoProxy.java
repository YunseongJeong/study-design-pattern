package com.designpatterns.java.structural.proxy_pattern.based_on_reflection;

import java.lang.reflect.Proxy;

public class DemoProxy {
    private Demo demo;
    public DemoProxy(){
        demo = new Demo();
    }

    public Object createProxy(Object proxiedObject){
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler hander = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, hander);
    }
}
