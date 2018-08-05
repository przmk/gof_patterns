package pl.sda.patterns.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class CalculatorParser {
    //4 + 5
    List<Expression> parse(String value){
        List<Expression> expressionList = new ArrayList<>();
        String[] split = value.split(" ");
        for (String s : split) {
            if ("+".equals(s)) {
                Expression expression = new PlusNumbersExpression();
                expressionList.add(expression);
            }else {
                Expression e = new AddNumberExpression(Integer.valueOf(s));
                expressionList.add(e);
            }
        }
        return expressionList;

    }
    public void evaluate(){
        Stack<Integer> contex = new Stack<>();
        List<Expression> parse = parse("3 4 6 + + 6 +");
        for (Expression expression : parse) {
            expression.interpret(contex);
        }

        System.out.println(contex.pop());
        List<Expression> parse2 = parse("3 +");


    }
}
