package com.algo;


import com.algo.HashTables.HashTableImplementation;


public class App {
    public static void main(String[] args) {



        HashTableImplementation myHash=new HashTableImplementation(5);
        myHash.put(6,"one");
        myHash.put(8,"two");
        myHash.put(11,"ht");
        myHash.put(6,"one+++");
        System.out.println("=================");
        System.out.println(myHash.get(6));
        System.out.println(myHash.get(8));
        System.out.println(myHash.get(11));
        System.out.println("Done");



    }


}
