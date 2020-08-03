package graphs;

import java.util.Arrays;
import java.util.List;

public class DepthFirstSearch {

    public static void DFS(Graph graph, int i, boolean[] visited) {

        visited[i] = true;
        System.out.println(i + " ");
        for (int j : graph.adjlist.get(i)) {
            if (!visited[j]) {
                DFS(graph, j, visited);
            }
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5), new Edge(2, 6),
                new Edge(5, 7));
        int v = 8;
        Graph graph = new Graph(edges, v);
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                DFS(graph, i, visited);
            }
        }
    }
}