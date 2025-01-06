package Graphs;

import java.util.ArrayList;

public class Graphs {

    static class Edge {
        int start;
        int neighbour;
        int weight;

        Edge(int start, int neighbour, int weight) {
            this.start = start;
            this.neighbour = neighbour;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int vertices = 7; // 0 to 6
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1, 10));
        graph.get(0).add(new Edge(0, 3, 40));

        graph.get(1).add(new Edge(1, 0, 10));
        graph.get(1).add(new Edge(1, 2, 10));

        graph.get(2).add(new Edge(2, 1, 10));
        graph.get(2).add(new Edge(2, 3, 10));

        graph.get(3).add(new Edge(3, 0, 40));
        graph.get(3).add(new Edge(3, 2, 10));
        graph.get(3).add(new Edge(3, 4, 10));

        graph.get(4).add(new Edge(4, 3, 2));
        graph.get(4).add(new Edge(4, 5, 3));
        graph.get(4).add(new Edge(4, 6, 8));

        graph.get(5).add(new Edge(5, 4, 10));
        graph.get(5).add(new Edge(5, 6, 10));

        graph.get(6).add(new Edge(6, 5, 10));
        graph.get(6).add(new Edge(6, 4, 10));

    }

}
