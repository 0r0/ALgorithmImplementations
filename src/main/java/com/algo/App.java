package com.algo;



import com.algo.BalancedStringExpression.BalancedExpression;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
        public static void main(String[] args) {

                boolean isBalanced = new BalancedExpression("[{11}][]").checkBalancedExpression();
                System.out.println(isBalanced);

        }
}
