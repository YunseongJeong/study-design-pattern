package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.application_context;

public interface ApplicationContext {
    Object getBean(String id);
}
