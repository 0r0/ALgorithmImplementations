package com.algo.QueueExample;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueAlgorithms {

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

    public static  void  reverse2(Queue<Integer> queue) {

        if(queue.isEmpty())
            return;
        System.out.println(queue);
        Stack<Integer> stack = new Stack<>();;
        while(!queue.isEmpty())
        {
            stack.push(queue.remove());;
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
