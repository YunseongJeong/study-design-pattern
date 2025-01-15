package com.designpatterns.java.behavioral.chain_of_responsibility_pattern;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        // ...
        if (!handled && successor != null){
            successor.handle(); // 이번 handler에서 처리가 안 됐고 다음 Handler가 있다면 다음 Hander로 책임을 연쇄
        }
    }
}
