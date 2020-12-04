package com.zhou.pojo;

public class Graph {
    public int v;
    public int e;
    public NodeHeadList []nodeHeadList;

    public Graph(int v,int e){
        this.v = v;
        this.e = e;
        this.nodeHeadList = new NodeHeadList[v+1];
        for(int i=1;i<=v;i++){
            this.nodeHeadList[i] = new NodeHeadList(i);
        }
    }

    public void linkTo(int i,int j){
        GraphNode graphNode = nodeHeadList[i].head;
        try {
            while (graphNode.next != null) {
                graphNode = graphNode.next;
            }
            GraphNode tempGraphNode = new GraphNode(nodeHeadList[j].head);
            graphNode.setNext(tempGraphNode);
        }catch(Exception e){
            System.out.println("nimeide");
            e.printStackTrace();
        }
    }
}
