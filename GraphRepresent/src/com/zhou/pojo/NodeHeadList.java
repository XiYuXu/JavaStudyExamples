package com.zhou.pojo;

public class NodeHeadList {
    public GraphNode head;

    public NodeHeadList(int v){
        this.head = new GraphNode();
        this.head.setNext(null);
        this.head.setData(v);
    }
}
