package com.algo.QueueExample;

import java.util.Arrays;

public class ArrayQueue {
    private int [] items;
    private int rear;
    private int front;
    private int count;
    public  ArrayQueue (int capacity) {
        items=new int[capacity];
    }

    public void enqueue(int item)
    {
        if(isFull())
            throw new IllegalStateException();
     items[rear] = item;
     rear=(rear+1)%items.length;
     count++;
    }
    public int dequeue(){
        if(isEmpty())
            return -1;
        var item=items[front];
        items[front]=0;
        front=(front+1)%items.length;
        count--;
        return item;
    }

    public boolean isEmpty(){
        if(count==0)
            return true;
        return false;
    }
    public boolean isFull() {
        if(count==items.length)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
