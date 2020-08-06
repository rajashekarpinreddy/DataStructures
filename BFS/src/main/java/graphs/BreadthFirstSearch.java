package graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void BFS(Graph graph, int i, boolean[] visited) {

        // create a queue used to do BFS
        Queue<Integer> q = new ArrayDeque<>();

        // mark source vertex as discovered
        visited[i] = true;

        // push source vertex into the queue
        q.add(i);

        // run till queue is not empty
        while (!q.isEmpty()) {
            // pop front node from queue and print it
            i = q.poll();
            System.out.print(i + " ");

            // do for every edge (v -> u)
            for (int u : graph.adjlist.get(i)) {
                if (!visited[u]) {
                    // mark it discovered and push it into queue
                    visited[u] = true;
                    q.add(u);
                }
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
            if (visited[i] == false) {
                BFS(graph, i, visited);
            }
        }
    }
}