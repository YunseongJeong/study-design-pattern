package com.designpatterns.java.behavioral.strategy_pattern;

public class Demo {
    public static void main(String[] args) {
        String type = args[0];

        Strategy strategy = StrategyFactory.getStrategy(type); // 전략을 고름
        strategy.algorithmInterface(); // 전략 실행
    }
}
