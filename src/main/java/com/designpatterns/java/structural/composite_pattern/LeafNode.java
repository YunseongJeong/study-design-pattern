package com.designpatterns.java.structural.composite_pattern;

// leaf node로 구체화
public class LeafNode extends Node {

    public LeafNode(long id) {
        super(id);
    }

    @Override
    public int countNodes() {
        return 1;
    }

}
