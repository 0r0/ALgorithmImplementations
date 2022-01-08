package com.algo.QueueExample;

import java.util.Stack;

public class QueueByTwoStacks {
    private Stack<Integer> firstStack = new Stack<Integer>();
    private Stack<Integer> secondStack = new Stack<>();

    public void enqueue(Integer item) {
        firstStack.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return secondStack.pop();
    }

    private void moveStack1ToStack2() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
    }

    public boolean isEmpty() {
        if(firstStack.isEmpty() && secondStack.isEmpty())
            return true;
        return false;
    }
    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return secondStack.peek();
    }

    @Override
    public String toString() {
        return "QueueByTwoStacks{" +
                "firstStack=" + firstStack +
                ", secondStack=" + secondStack +
                '}';
    }
}
