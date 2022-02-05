package com.algo.TreeExample;

public class Tree {
    private class Node{
        private int value;
        private  Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node= "+ value;
        }



    }
    private Node root;
    public void insert(int value)
    {
        var node=new Node(value);
        if(root==null){
            root = node;
            return;
        }
        var current = root;
        while(true){
            if(current.value<value){
                if(current.rightChild==null)
                {
                    current.rightChild = node;
                    break;
                }
                current=current.rightChild;

            }
            else{
                if(current.leftChild==null)
                {
                    current.leftChild = node;
                    break;
                }
                current=current.leftChild;
            }
        }
    }
    public boolean find(int value)
    {
        var current=root;
        while(current!=null) {

            if (value < current.value)
                current=current.leftChild;
            else if(value > current.value)
                current=current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder()
    {
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root)
    {
        if (root==null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root)
    {
        if (root==null)
            return;
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }
    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root)
    {
        if (root==null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    private boolean isLeaf(Node node)
    {
        return node.rightChild== null && node.leftChild==null ;

    }
    public int height()
    {
        return height(root);
    }
    private int height(Node root)
    {
        if(root==null)
            return -1;
        if(isLeaf(root))
            return 0;
        return 1+Math.max(height(root.leftChild), height(root.rightChild));
    }
    public int min(){
        return min(root);
    }
    private int min(Node root)
    {

        if(isLeaf(root))
            return root.value;
        var left=min(root.leftChild);
        var right=min(root.rightChild);
        return Math.min(Math.min(left,right), root.value);
    }
    public boolean isEqual(Tree tree)
    {

        return isEqual(root,tree.root);
    }
    private boolean isEqual(Node root, Node other)
    {
        if(root==null && other==null)
            return true;
        if(root!=null && other!=null)
            return (root.value==other.value) &&(isEqual(root.leftChild,other.leftChild) && isEqual(root.rightChild,other.rightChild));
        return false;
    }
    public boolean validatingBinarySearch(){
        return validatingBinarySearch(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    private boolean validatingBinarySearch(Node root,int max,int min){
        if(root==null)
            return true;
        if(root.value>max || root.value<min)
            return false;
        return validatingBinarySearch(root.leftChild,root.value-1,min) && validatingBinarySearch(root.rightChild,max,root.value+1);
    }
}

