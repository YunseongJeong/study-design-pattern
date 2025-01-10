package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.bean_config_parser;

import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.BeanDefinition;

import java.io.InputStream;
import java.util.List;

public class XmlBeanConfigParser implements BeanConfigParser {
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        return List.of();
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        return List.of();
    }
}
