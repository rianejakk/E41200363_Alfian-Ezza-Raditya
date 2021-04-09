package com.binary.graph;

public class GraphApp {
    public static void main(String[] args) {

        Graph theGraph = new Graph();

        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(1, 3);
        theGraph.addEdge(3, 2);
        theGraph.addEdge(2, 1);
        theGraph.addEdge(1, 4);

        theGraph.display();
        theGraph.bfs();
    }
}
