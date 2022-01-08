package com.algo.QueueExample;

import java.util.Stack;

public class QueueByStack {
    private Stack<Integer> firstStack =new Stack<>();
    private Stack<Integer> secondStack =new Stack<>();
    public void enqueue(Integer item)
    {
        while(!secondStack.isEmpty())
        {
            firstStack.push(secondStack.pop());
        }
        firstStack.push(item);

    }
    public  int dequeue()
    {
        if(secondStack.isEmpty())
            return -1;
        while(!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        return  secondStack.pop();
    }

    @Override
    public String toString() {
        return "QueueByStack{" +
                "firstStack=" + firstStack +
                ", secondStack=" + secondStack +
                '}';
    }
}
