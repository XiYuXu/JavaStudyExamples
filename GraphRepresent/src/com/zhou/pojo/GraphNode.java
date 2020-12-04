package com.zhou.pojo;

public class GraphNode {
    public  GraphNode next;
    public boolean visited;
    public int data;

    public GraphNode(){

    }
    public GraphNode(GraphNode graphNode){
        this.data = graphNode.data;
        this.next = graphNode.next;
        this.visited = false;
    }

    public GraphNode getNext() {
        return next;
    }

    public void setNext(GraphNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
