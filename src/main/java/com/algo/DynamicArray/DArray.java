package com.algo.DynamicArray;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class DArray {
    private int[] items;
    private int count;

    public DArray(int length) {
        items = new int[length];

    }

    public void insert(int item) {

        // create counter for items that exist in array
        /*
         * if counter is less than array length it must add new item in index of count+1
         * else if counter equal to length then make new item array with multiple length
         */

        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[count++] = item;
        System.out.println("from insert");
        System.out.println(Arrays.toString(items));
        System.out.println("=================");

    }

    public void remove(int index) {
        // validation
        if (index >= count || index < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        System.out.println(index);
        System.out.println(count);
        count--;
        // sys
        System.out.println(Arrays.toString(items));
        System.out.println(count);
    }

    public int indexOf(int item) {
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
