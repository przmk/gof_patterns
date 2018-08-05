package pl.sda.patterns.behavior.interpreter;

import java.util.Stack;

class AddNumberExpression implements Expression {
    private Integer value;

    public AddNumberExpression(Integer value) {
        this.value = value;
    }

    public void interpret(Stack<Integer> context) {
        context.push(value);
    }
}
