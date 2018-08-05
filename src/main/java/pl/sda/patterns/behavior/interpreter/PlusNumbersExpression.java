package pl.sda.patterns.behavior.interpreter;

import java.util.Stack;

class PlusNumbersExpression implements Expression {

    public void interpret(Stack<Integer> context) {
        Integer value1 = context.pop();
        Integer value2 = context.pop();
        context.push(value1 + value2);
    }
}
