package Graphs;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/print-adjacency-list-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-adjacency-list
public class PrintAdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i<edges.length; i++) {
            for (int j = 1; j < edges[i].length; j++) {
                graph.get(edges[i][0]).add(edges[i][j]);
                graph.get(edges[i][j]).add(edges[i][0]);
            }
        }
        return graph;
    }
}
