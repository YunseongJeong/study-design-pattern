package com.designpatterns.java.structural.adapter_pattern.based_object;

import com.designpatterns.java.structural.adapter_pattern.Adaptee;
import com.designpatterns.java.structural.adapter_pattern.ITarget;

public class Adapter implements ITarget {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        // f2 재구현
    }

    @Override
    public void fc() {
        adaptee.fc(); // class 기반에 비해 수동적으로 해줘야한다.
    }
}
