package com.algo;


import com.algo.HashTables.HashTableImplementation;
import com.algo.TreeExample.Tree;


public class App {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(11);
        //tree.find(11);
        System.out.println(tree.find(4));
        System.out.println(tree.find(55));
        System.out.println("done");
        tree.traversePreOrder();
        System.out.println("done");
        tree.traverseInOrder();
        System.out.println("done");
        tree.traversePostOrder();

    }


}
