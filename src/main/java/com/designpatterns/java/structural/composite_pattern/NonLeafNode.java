package com.designpatterns.java.structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

// non-leaf node로 구체화
public class NonLeafNode extends Node {
    private List<Node> subNodes = new ArrayList<>();

    public NonLeafNode(long id) {
        super(id);
    }

    @Override
    public int countNodes() {
        int counter = 1;
        for (Node node : subNodes){
            counter += node.countNodes();
        }
        return counter;
    }

}
