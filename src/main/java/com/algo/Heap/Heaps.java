package com.algo.Heap;

public class Heaps {
    private int[] heap=new int[10];
    private int size;


    public void insert(int value){
        if(isFull())
            throw  new IllegalStateException();
        heap[size++]=value;
        bubbleUp();

    }
    private boolean isFull(){
        return size==heap.length;
    }
    private void bubbleUp(){
        var index=size-1;
        while(index>0 && heap[index]>heap[parent(index)])
        {
            swap(index,parent(index));
            index=parent(index);
        }
    }
    private int parent(int index)
    {
        return (index-1)/2;
    }

    private void swap(int first,int second)
    {
        var temp=heap[first];
        heap[first]=heap[second];
        heap[second]=temp;
    }


}
