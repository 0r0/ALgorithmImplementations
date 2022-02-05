package com.algo;


import com.algo.HashTables.HashTableImplementation;
import com.algo.TreeExample.Tree;


public class App {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(6);
        tree.insert(4);
        tree.insert(11);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(21);
        tree.insert(2);
        Tree tree2=new Tree();
        tree2.insert(6);
        tree2.insert(4);
        tree2.insert(11);
        tree2.insert(7);
        tree2.insert(8);
        tree2.insert(9);
//        tree2.insert(21);
        tree2.insert(2);
       // System.out.println(tree.isEqual(tree2));
        System.out.println(tree2.validatingBinarySearch());
        System.out.println(tree2.getNodesAtDistance(2));
//        tree.insert(3);
        //tree.find(11);
//        System.out.println(tree.find(4));
//        System.out.println(tree.find(55));
//        System.out.println("done");
//        tree.traversePreOrder();
//        System.out.println("done");
//        tree.traverseInOrder();
//        System.out.println("done");
//        tree.traversePostOrder();
//        System.out.println(tree.height());
        //System.out.println(tree.min());

    }


}
