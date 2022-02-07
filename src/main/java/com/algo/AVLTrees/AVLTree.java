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

    @Override
    public String toString() {
        return "AVLTree{" +
                "root=" + root.value +
                " root.rightChild="+root.rightChild.value +
                " root.leftChild="+root.leftChild.value +
                '}';
    }

    private Node insert(Node root, int value)
    {
        if(root==null)
            return new Node(value);
        if(value< root.value)
            root.leftChild=insert(root.leftChild,value);
        else
            root.rightChild=insert(root.rightChild,value);
        setHeight(root);
         return  balance(root);

    }
    private void setHeight(Node node)
    {
        node.height=Math.max(height(node.leftChild),height(node.rightChild))+1;
    }
    private Node balance(Node node)
    {
        if(isLeftHeavy(node)) {
            if(balanceFactor(node.leftChild)<0)
                node.leftChild=rotateToLeft(node.leftChild);
            return rotateToRight(node);

        }
        else if(isRightHeavy(node)) {
            if(balanceFactor(node.rightChild)>0)
                node.rightChild=rotateToRight(node.rightChild);
            return rotateToLeft(node);

        }
        return node;
    }
    private int height(Node node)
    {
        return (node==null) ? -1: node.height;
    }
    public int balanceFactor(Node node)
    {
      return (node==null)? 0: height(node.leftChild)-height(node.rightChild);
    }
    private boolean isLeftHeavy(Node node)
    {
        return balanceFactor(node)>1;

    }
    private boolean isRightHeavy(Node node){
        return balanceFactor(node)< -1;

    }
    private Node rotateToRight(Node node)
    {
       var newNode=node.leftChild;
       node.leftChild=newNode.rightChild;
       newNode.rightChild=node;
       setHeight(node);
       setHeight(newNode);
       return newNode;
    }
    private Node rotateToLeft(Node node)
    {
        var newNode=node.rightChild;
        node.rightChild=newNode.leftChild;
        newNode.leftChild=node;
        setHeight(node);
        setHeight(newNode);
        return newNode;
    }

}
