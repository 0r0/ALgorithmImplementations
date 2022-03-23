package com.algo.Heap;

public class MaxHeap {
    public static void heapify(int[] items){
      for(int i=items.length/2-1;i>=0;i--)
          heapify(items,i);
    }
    private static void heapify(int[] items,int index){
        var largerIndex=index;
        var length=items.length;
        int leftChildIndex=leftChildIndex(index);
        int rightChildIndex=rightChildIndex(index);
        if(leftChildIndex<length && items[largerIndex]<items[leftChildIndex])
            largerIndex=leftChildIndex;
        if(rightChildIndex<length && items[largerIndex]<items[rightChildIndex])
            largerIndex=rightChildIndex;

        if(largerIndex==index)
            return;
        swap(items,index,largerIndex);
        heapify(items,index++);

    }
    private static int leftChildIndex(int index)
    {
        return index*2+1;
    }
    private static int rightChildIndex(int index)
    {
        return index*2+2;
    }
    private static void swap(int[] items,int first,int second)
    {
        var temp=items[first];
        items[first]=items[second];
        items[second]=temp;
    }
    public static int kthLargerItem(int k,int[] numbers)
    {
        if(k<0 ||k >numbers.length)
            throw  new IllegalArgumentException();
        var heap =new Heaps();
        for(var number:numbers)
        {
            heap.insert(number);
        }
        for(int i=0;i<k;i++)
        {
            heap.remove();
        }
        return heap.max();

    }



}
