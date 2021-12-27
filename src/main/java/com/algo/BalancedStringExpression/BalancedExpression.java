package com.algo.BalancedStringExpression;

import java.util.Stack;

public class BalancedExpression {
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
        if (c == '(' || c == '[' || c == '{') {
            return true;
        }
        return false;

    }

    private boolean isRightBracket(char c) {
        if (c == ']' || c == '}' || c == ')')
            return true;
        return false;
    }

    private boolean bracketMatch(char left, char right) {
        return ((right == ']' && left != '[') || (right == '}' && left != '{') || (right == ')' && left != '('));



    }
}
