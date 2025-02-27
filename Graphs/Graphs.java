package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

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

    public static boolean hasPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (Edge edge : graph.get(src)) { // graph.get(src) will return us an array list which will replace it and
                                           // hence code will be Edge edge: ArrayList<Edge>
            if (visited[edge.neighbour] == false) {
                boolean hasNbrPath = hasPath(graph, edge.neighbour, dest, visited);
                if (hasNbrPath == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printAllPaths(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited,
            String pathSoFar) {
        if (src == dest) {
            System.out.println(pathSoFar);
            return;
        }
        visited[src] = true;
        for (Edge edge : graph.get(src)) { // graph.get(src) will return us an array list which will replace it and
                                           // hence code will be Edge edge: ArrayList<Edge>
            if (visited[edge.neighbour] == false) {
                printAllPaths(graph, edge.neighbour, dest, visited, pathSoFar + edge.neighbour);
            }
        }
        visited[src] = false;
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
        // System.out.println(graph);
        // System.out.println(hasPath(graph, 0, 6, visited));
        // printAllPaths(graph, 0, 6, visited, 0 + "");

        // for (ArrayList<Edge> arrayList : graph) {
        // for (Edge edge: arrayList) {
        // System.out.println();
        // }

        // }
        // System.out.println(graph);

        int src = 0;
        PriorityQueue<CurrentVertex> pq = new PriorityQueue<>();

        boolean[] visited = new boolean[vertices];
        pq.offer(new CurrentVertex(src, src + " ", 0));
        while (pq.size() > 0) {
            CurrentVertex removedVertex = pq.remove();
            if (visited[removedVertex.vertex] = true) {
                continue;
            }
            visited[removedVertex.vertex] = true;
            System.out.println(src + " " + removedVertex.pathSoFar + removedVertex.weightSoFar);
            for (Edge e : graph.get(removedVertex.vertex)) {
                if (visited[removedVertex.vertex] == false) {
                    pq.add(new CurrentVertex(e.neighbour, removedVertex.weightSoFar + e.weight,
                            removedVertex.pathSoFar + e.neighbour));
                }
            }
        }
    }

    public static class CurrentVertex {
        int vertex;
        String weightSoFar;
        int pathSoFar;

        CurrentVertex(int vertex, String weightSoFar, int pathSoFar) {
            this.vertex = vertex;
            this.weightSoFar = weightSoFar;
            this.pathSoFar = pathSoFar;
        }
    }

}
