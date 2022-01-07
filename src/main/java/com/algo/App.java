package com.algo;



import com.algo.BalancedStringExpression.BalancedExpression;
import com.algo.QueueExample.QueueAlgorithms;
import com.algo.TreeExample.Tree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Hello world!
 */
public class App {
        public static void main(String[] args) {

                Queue<Integer> queue = new ArrayDeque<Integer>();
                queue.add(10);
                queue.add(20);
                queue.add(30);
                queue.add(40);
                queue.add(50);

               QueueAlgorithms.reverse1(queue);
                QueueAlgorithms.reverse2(queue);
        }



}
