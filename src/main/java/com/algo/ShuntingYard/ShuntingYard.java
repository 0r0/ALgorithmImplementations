package com.algo.ShuntingYard;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShuntingYard {


    public int calculate(String s) {
            int l1 = 0, o1 = 1;
            int l2 = 1, o2 = 1;
            Deque<Integer> stack = new ArrayDeque();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if(Character.isDigit(c)){
                    int num = c - '0';

                    while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                        num = num *10 + (s.charAt(++i) - '0');
                    }

                    l2 = (o2 == 1 ? l2 * num: l2 / num);

                } else if (c == '('){
                    // First preserve current calculation status
                    stack.offerFirst(l1); stack.offerFirst(o1);
                    stack.offerFirst(l2); stack.offerFirst(o2);

                    // Reset them for the next calculation
                    l1 = 0; o1 = 1;
                    l2 = 1; o2 = 1;

                } else if (c== ')'){
                    // First preserve the result of current calculation
                    int num = l1 + o1 * l2;

                    // Then restore previous calculation status
                    o2 = stack.poll(); l2 = stack.poll();
                    o1 = stack.poll(); l1 = stack.poll();
                    // Previous calculation status is now in effect
                    l2 = (o2 == 1 ? l2 * num : l2 / num);

                } else if (c == '*' || c == '/'){
                    o2 = ( c == '*'? 1: -1);

                } else if (c == '+' || c == '-'){
                    l1 = l1 + o1 * l2;
                    o1 = (c == '+'? 1: -1);
                    l2 = 1; o2 = 1;
                }
            }

            return (l1 + o1 * l2);
        }
    public int calculate2(String s) {
        int l1 = 0, o1 = 1;
        int l2 = 1, o2 = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = c - '0';

                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(++i) - '0');
                }

                l2 = (o2 == 1 ? l2 * num : l2 / num);

            } else if (c == '(') {
                int j = i;

                for (int cnt = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(') cnt++;
                    if (s.charAt(i) == ')') cnt--;
                    if (cnt == 0) break;
                }

                int num = calculate(s.substring(j + 1, i));

                l2 = (o2 == 1 ? l2 * num : l2 / num);

            } else if (c == '*' || c == '/') {
                o2 = (c == '*' ? 1 : -1);

            } else if (c == '+' || c == '-') {
                l1 = l1 + o1 * l2;
                o1 = (c == '+' ? 1 : -1);

                l2 = 1; o2 = 1;
            }
        }

        return (l1 + o1 * l2);
    }
}
