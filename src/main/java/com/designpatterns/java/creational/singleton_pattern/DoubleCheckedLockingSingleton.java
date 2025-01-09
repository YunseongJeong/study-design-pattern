package com.designpatterns.java.creational.singleton_pattern;

// 지연 적재, 높은 동시성을 가지는 이중 잠금 싱글톤 패턴이다.
public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null){
            synchronized (DoubleCheckedLockingSingleton.class) { // Class 레벨의 잠금 처리 (이 블럭안의 코드는 이 class의 기준으로 동시성이 1이 된다.)
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
