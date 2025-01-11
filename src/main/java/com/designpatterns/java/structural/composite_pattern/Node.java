package com.designpatterns.java.structural.composite_pattern;

// leaf node와 non-leaf node의 공통된 인터페이스를 제공한다.
public abstract class Node {
    protected long id;

    public Node(long id){
        this.id = id;
    }
    public abstract int countNodes();
}
