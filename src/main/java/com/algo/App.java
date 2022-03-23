package com.algo;




import com.algo.Heap.MaxHeap;

import java.util.Arrays;




public class App {
    public static void main(String[] args) {
        int[] arr= {5,3,8,4,1,2,55,95,27,31};
        MaxHeap.heapify(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(MaxHeap.kthLargerItem(20,arr));





    }


}
