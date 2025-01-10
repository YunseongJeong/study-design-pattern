package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework;

import com.sun.source.tree.Scope;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

public class BeanDefinition {
    private String id;
    private String className;
    private List<ConstructorArgs> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;

    public String getClassName(){
        return className;
    }

    public String getId(){
        return id;
    }

    public List<ConstructorArgs> getConstructorArgs() {
        return constructorArgs;
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public boolean isSingleton(){
        return scope == Scope.SINGLETON;
    }

    public static enum Scope{
        SINGLETON,
        PROTOTYPE
    }

    public static class ConstructorArgs{
        public boolean isRef;
        public Class type;
        public Object arg;
    }

}
