package com.designpatterns.java.behavioral.state_pattern.based_on_branch;


public class StateMachine {
    enum State {
        NORMAL,
        BAD,
        GOOD
    }

    private State currentState = State.NORMAL;

    public void goodEvent(){ // 다음과 같이 event에 따라서 분기를 기준으로 상태를 전이한다.
        if (currentState == State.BAD){
            currentState = State.NORMAL;
        } else if (currentState == State.NORMAL){
            currentState = State.GOOD;
        }
    }

    public void badEvent(){
        if (currentState == State.GOOD){
            currentState = State.NORMAL;
        } else if (currentState == State.NORMAL){
            currentState = State.BAD;
        }
    }
    public void NormalEvent(){
        //..
    }
}
