package com.algo;



import com.algo.Heap.Heaps;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        var heaps=new Heaps();
        int[] numbers= {10,20,30,7,11};

        for(var number:numbers)
            heaps.insert(number);

        System.out.println("inserted");

        int i=0;
        while(!heaps.isEmpty()){

            numbers[i]= heaps.remove();
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println(Arrays.toString(numbers));



    }


}
