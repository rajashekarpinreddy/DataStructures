package AdjacencyMatrix;

import java.util.Scanner;

public class AdjacencyMatrix {

    int vertices;
    int[][] adjacencymatrix;

    public AdjacencyMatrix(int v) {
        this.vertices = v;
        adjacencymatrix = new int[v + 1][v + 1];
    }

    public void AddEdge(int to, int from, int edge) {

        adjacencymatrix[to][from] = edge;

    }

    public int GetEdge(int to, int form) {
        return adjacencymatrix[to][from];
    }

    public static void main(String[] args) {
        int v, e, to = 0, from = 0, count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        v = sc.nextInt();
        System.out.println("enter number of edges");
        e = sc.nextInt();
        AdjacencyMatrix graph = new AdjacencyMatrix(v);
        while (count <= e) {
            to = sc.nextInt();
            from = sc.nextInt();
            graph.AddEdge(to, from, 1);
            count++;
        }
        System.out.println("The Adjacency Matrix for given Graph is :");
        System.out.print("");
        for (int i = 1; i <= v; i++) {
            System.out.print(i + "");
        }
        System.out.println();
        for (int i = 1; i <= v; i++) {
            System.out.print(i + "");
            for (int j = 1; j <= v; j++) {
                System.out.print(graph.getEdge(i, j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
