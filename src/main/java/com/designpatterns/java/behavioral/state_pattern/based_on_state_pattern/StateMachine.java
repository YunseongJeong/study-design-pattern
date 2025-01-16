package com.designpatterns.java.behavioral.state_pattern.based_on_state_pattern;

import javax.swing.plaf.nimbus.State;

public class StateMachine {
    IState currentState = new NormalState();

    public void goodEvent(){ // 현재 상태의 메서드를 호출한다.
        currentState.goodEvent(); // 이 메서드 안에서 state를 변경한다.
    }
    //..
}

interface IState{
    void goodEvent();
    void badEvent();
    void normalEvent();
}

class GoodState implements IState{

    @Override
    public void goodEvent() {

    }

    @Override
    public void badEvent() {

    }

    @Override
    public void normalEvent() {

    }
}
class BadState implements IState{

    @Override
    public void goodEvent() {

    }

    @Override
    public void badEvent() {

    }

    @Override
    public void normalEvent() {

    }
}
class NormalState implements IState{

    @Override
    public void goodEvent() {

    }

    @Override
    public void badEvent() {

    }

    @Override
    public void normalEvent() {

    }
}