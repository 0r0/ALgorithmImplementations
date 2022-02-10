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

    public void remove()
    {
        if(isEmpty())
            throw new IllegalStateException();
        var index=0;
        heap[index]=heap[--size];
        while(index<size && !isValid(index))
        {
            var largerChildIndex=largerChildIndex(index);
            swap(index,largerChildIndex);
            index=largerChildIndex;
        }

    }
    private boolean isEmpty()
    {
        return size==0;
    }
    private int largerChildIndex(int index)
    {
        return leftChild(index)>rightChild(index) ?leftChildIndex(index):rightChildIndex(index);
    }
    private boolean isValid(int index){
        return heap[index]>leftChild(index) && heap[index]>rightChild(index) ;
    }
    private int leftChild(int index)
    {
        return heap[leftChildIndex(index)];
    }
    private int rightChild(int index)
    {
        return heap[rightChildIndex(index)];
    }
    private int  leftChildIndex(int index)
    {
        return index*2+1;

    }
    private int rightChildIndex(int index)
    {
        return index*2+2;
    }

}
