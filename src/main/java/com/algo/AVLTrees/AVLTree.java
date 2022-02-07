package com.algo.AVLTrees;

public class AVLTree {
    private Node root;
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        private int height;
        public Node(int value)
        {
            this.value=value;
        }
    }
    public void insert(int value)
    {
        root=insert(root,value);
    }
    private Node insert(Node root,int value)
    {
        if(root==null)
            return new Node(value);
        if(value< root.value)
            root.leftChild=insert(root.leftChild,value);
        else
            root.rightChild=insert(root.rightChild,value);
        root.height=Math.max(height(root.leftChild),height(root.rightChild))+1;
        return root;

    }
    private int height(Node node)
    {
        return (node==null) ? -1: node.height;
    }

}
