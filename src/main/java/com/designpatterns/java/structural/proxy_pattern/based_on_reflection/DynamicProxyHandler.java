package com.designpatterns.java.structural.proxy_pattern.based_on_reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private final Object proxiedObject;

    public DynamicProxyHandler(Object proxiedObject){
        this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // proxy 로직
        return method.invoke(proxiedObject, args); //원본 클래스의 로직
    }
}
