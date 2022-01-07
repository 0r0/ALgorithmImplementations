package com.algo;



import com.algo.BalancedStringExpression.BalancedExpression;
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
                //System.out.println(queue);
                reverse1(queue);

        }

        public static void reverse1(Queue<Integer> queue) {
                if(queue.isEmpty())
                        return;

                Object[] queueArray=queue.toArray();
                Queue<Integer> reverseQueue = new ArrayDeque<>();
                for(int i=queueArray.length-1; i>=0; i--)
                {
                        reverseQueue.add((int)queueArray[i]);
                }
                System.out.println(queue);
                System.out.println(reverseQueue);

        }

}
