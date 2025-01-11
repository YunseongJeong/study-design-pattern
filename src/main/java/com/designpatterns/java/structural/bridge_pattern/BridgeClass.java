package com.designpatterns.java.structural.bridge_pattern;

import com.designpatterns.java.structural.bridge_pattern.components.IComponent1;
import com.designpatterns.java.structural.bridge_pattern.components.IComponent2;

public class BridgeClass {
    IComponent1 component1;
    IComponent2 component2;
    public BridgeClass(IComponent1 component1, IComponent2 component2){
        this.component1 = component1;
        this.component2 = component2;
    }
}
