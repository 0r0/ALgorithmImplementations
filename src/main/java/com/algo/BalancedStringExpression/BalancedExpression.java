package com.algo.BalancedStringExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List<Character> right = Arrays.asList(')',']','}');
    private final List<Character> left = Arrays.asList('(','[','{');
    private String expression;

    public BalancedExpression(String expression) {
        this.expression = expression;
    }

    public boolean checkBalancedExpression() {
        Stack<Character> stackOfExpression = new Stack<Character>();
        for (Character c : expression.toCharArray()) {
            if (isLeftBracket(c)) {
                stackOfExpression.push(c);

            }

            if (isRightBracket(c)) {
                if (stackOfExpression.isEmpty())
                    return false;
                Character top = stackOfExpression.pop();
                if (bracketMatch(top, c))
                    return false;
            }

        }

        return stackOfExpression.isEmpty();

    }


    private boolean isLeftBracket(char c) {
        return left.contains(c);

    }

    private boolean isRightBracket(char c) {
        return right.contains(c);
    }

    private boolean bracketMatch(char left, char right) {
        return ((right == ']' && left != '[') || (right == '}' && left != '{') || (right == ')' && left != '('));



    }
}
