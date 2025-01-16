package com.designpatterns.java.behavioral.state_pattern.based_on_table;

public class StateMachine {
    enum State {
        NORMAL(0),
        BAD(1),
        GOOD(2);

        State(int value){
            this.value = value;
        }
        public int value;
    }

    enum Event {
        NORMAL(0),
        BAD(1),
        GOOD(2);

        Event(int value){
            this.value = value;
        }
        public int value;
    }

    private static final State[][] transitionTable = { // state와 event의 관계에 따라서 상태의 전의 조건, 실행 조건을 table로 관리한다.
            {State.NORMAL, State.BAD, State.GOOD},
            {State.BAD, State.BAD, State.NORMAL},
            {State.GOOD, State.NORMAL, State.GOOD}
    };

    private State currentState = State.NORMAL;

    public void executeEvent(Event event){
        currentState = transitionTable[currentState.value][event.value];
    }
}
