package com.designpatterns.java.creational.singleton_pattern;

// 지연 초기화 방식의 구현이다.
public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){}

    // 지연 적재를 지원한다.
    // 늦게 인스턴스를 만드는 것이 메모리 차원에서 이득일 수 있겠지만
    // 초기화 작업이 시스템 성능에 영향을 미칠 수 있다거나 예상치 못한 문제를 빨리 노출 시키는 fail-fast 설계 원칙에 따르면
    // 지연 적재가 단점이 더 많을 수 있다.
    // 또한 동시성이 1이 되기 때문에 getInstance()의 사용빈도가 높다면 병목 현상이 일어날 수 있다.
    public static synchronized LazyInitializationSingleton getInstance(){ // instance의 유일성을 보장하기 위해 synchronized를 붙여준다.
       if (instance == null)
           instance = new LazyInitializationSingleton();

       return instance;
    }
}
