package com.designpatterns.java.behavioral.chain_of_responsibility_pattern;

public abstract class Handler {
    protected  Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handle();
}

