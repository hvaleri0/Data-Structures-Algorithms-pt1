package com.codewithmosh;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalanceExpression {
    private String input;
    private final List<Character> rightBracket
            = Arrays.asList(')', '>', ']', '}');
    private final List<Character> leftBracket
            = Arrays.asList('(', '<', '[', '{');

    BalanceExpression (String input) {
        this.input = input;
    }

    public boolean isBalance() {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.isEmpty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }

    private boolean bracketsMatch (char left, char right) {
        var test1 = leftBracket.indexOf(left);
        var test2 = rightBracket.indexOf(right);
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
