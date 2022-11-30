package task3;

import java.util.*;

class Graph {
    static int[] parent = new int[1000000];

    static int root(int a) {
        if (a == parent[a]) {
            return a;
        }
        return parent[a] = root(parent[a]);
    }

    static void connect(int a, int b) {
        a = root(a);
        b = root(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    static void connectedComponents(int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(parent[i]);
        }
        System.out.println("At the entrance there are " + s.size()  +  " separate graphs.");
    }

    static void printAnswer(int N, int[][] edges) {
        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            connect(edges[i][0], edges[i][1]);
        }
        connectedComponents(N);
    }
}