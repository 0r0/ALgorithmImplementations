package com.algo.Graphs;

public class Graph {
    private   Node[] nodes;
    private int count=0;

    public Graph(int length)
    {
        this.nodes = new Node[length];
    }

    private class Node{
        public String label;
    }

    public  void  AddNode(String label)
    {
        //check node is exist!
        for(int i=0;i<nodes.length;i++)
        {
            if(nodes[i].label.equals(label))
            {
                return;
            }
        }
        nodes[count++].label=label;


    }
    public int removeNode(String label)
    {
        for(int i=0;i<nodes.length;i++)
        {
            if(nodes[i].label.equals(label))
            {
                nodes[i]=null;
                return i;
            }
        }
        return -1;
    }
    public void addEdge(Node from,Node to)
    {

    }
    public void removeEdge(Node from,Node to)
    {

    }


}
