package com.binary.graph;

import java.util.*;

public class dfs {
    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    dfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    public void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String args[])
    {
        dfs g = new dfs(9);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 8);
        g.addEdge(6, 7);
        g.addEdge(8, 7);

        System.out.println(
                "Depth First Search (dari vertex 0)");

        g.DFS(0);
    }
}
