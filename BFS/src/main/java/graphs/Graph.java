package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Integer>> adjlist = null;

    public Graph(List<Edge> edges, int v) {
        adjlist = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (Edge e : edges) {
            int src = e.src;
            int dest = e.dest;
            adjlist.get(src).add(dest);
            adjlist.get(dest).add(src);
        }
    }

}