package com.zhou.pojo;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int e = scanner.nextInt();

        Graph graph = new Graph(v,e);

        for(int i=0;i<e;i++){
            int preNode = scanner.nextInt();
            int laterNode = scanner.nextInt();
            graph.linkTo(preNode,laterNode);
        }

        //测试第一个邻接表生效
        /*GraphNode graphNode = graph.nodeHeadList[1].head;
        while(graphNode.next != null){
            System.out.println(graphNode.getData());
            graphNode = graphNode.next;
        }*/
    }
}
