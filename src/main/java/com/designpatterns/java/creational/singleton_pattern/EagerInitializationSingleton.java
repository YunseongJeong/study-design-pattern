package com.designpatterns.java.creational.singleton_pattern;

// 즉시 초기화 방식의 구현이다.
public class EagerInitializationSingleton {
    // instance는 Class가 메모리에 적재 될 때 초기화가 된다.
    // (객체가 생성될 때 스레드 안전성이 보장된다, 지연 로딩을 지원하지 않는다.)
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){}
    public static EagerInitializationSingleton getInstance(){
        return instance;
    }
}
