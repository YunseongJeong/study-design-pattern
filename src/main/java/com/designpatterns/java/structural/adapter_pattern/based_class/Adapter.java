package com.designpatterns.java.structural.adapter_pattern.based_class;

import com.designpatterns.java.structural.adapter_pattern.Adaptee;
import com.designpatterns.java.structural.adapter_pattern.ITarget;

public class Adapter extends Adaptee implements ITarget {

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // f2()의 재구현
    }

    // fc()는 다시 구현할 필요 없다.
}
