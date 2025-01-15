package com.designpatterns.java.behavioral.strategy_pattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();
    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type){
        return strategies.get(type);
    }
}