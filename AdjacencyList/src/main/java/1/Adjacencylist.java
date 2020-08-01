//package AdjacencyList;

import java.util.ArrayList;

public class Adjacencylist {

    public static void AddEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static void PrintGraph(ArrayList<ArrayList<Integer>> adj) {

        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("->" + adj.get(i).get(j));
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        AddEdge(adj, 0, 1);
        AddEdge(adj, 0, 2);
        AddEdge(adj, 1, 3);
        AddEdge(adj, 2, 4);
        AddEdge(adj, 3, 4);
        PrintGraph(adj);

    }
}
