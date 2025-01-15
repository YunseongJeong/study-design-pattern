package com.designpatterns.java.behavioral.template_method_pattern;


public abstract class AbstractClass {
    // 미리 method들을 조합으로 template을 만들어준다.
    public final void templateMethod(){ // subclass에서 변경될 수 없게 final로 정의한다.
        // ...
        method1();
        // ...
        method2();
        // ...
    }

    protected abstract void method1();
    protected abstract void method2();
}
