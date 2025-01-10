package com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.bean_config_parser;

import com.designpatterns.java.creational.factory_pattern.dependency_injection_container.framework.BeanDefinition;

import java.io.InputStream;
import java.util.List;

// 빈 설정을 읽고 Bean Definition의 형태로 파싱한다.
public interface BeanConfigParser {
    public List<BeanDefinition> parse(InputStream inputStream);
    public List<BeanDefinition> parse(String configContent);
}
