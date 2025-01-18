package com.designpatterns.java.behavioral.interpreter_pattern;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionInterpreter {
    private Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression){
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length+1) / 2; ++i){
            numbers.addLast(new NumberExpression(elements[i]));
        }
        for (int i = (length+1)/2; i < length ; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);
            if (isValid){
                throw new RuntimeException();
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combinedExp = null;
            if (operator.equals("+")){
                combinedExp = new AdditionExpression(exp1,  exp2);
            } // other operators

            long result = combinedExp.interpret();
            numbers.addFirst(new NumberExpression(result));

        }
        return numbers.pop().interpret();
    }
}
