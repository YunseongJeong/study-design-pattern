package com.designpatterns.java.creational.singleton_pattern;

// 홀더에 의한 초기화 방식의 싱글턴이다.
public class InitializationByHolderSingleton {
    private InitializationByHolderSingleton(){};

    private static class SingletonHolder { // 이 nested class는 getInstance가 호출 될 때 적재 된다. (그렇기에 지연 적재, 스레드 안정성이 보장된다.)
        private static final InitializationByHolderSingleton instance = new InitializationByHolderSingleton();
    }

    public static InitializationByHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
