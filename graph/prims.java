import java.util.*;

public class prims {
    static class edge {
        int src;
        int dst;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void cg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));
        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));
        graph[2].add(new edge(2, 1, 15));
        graph[2].add(new edge(2, 3, 50));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 3, 20));
    }

    public static class pair implements Comparable<pair> {
        int node;
        int cost;

        public pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prim(ArrayList<edge> graph[], int v) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        pq.add(new pair(0, 0));
        int fcost = 0;
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                fcost += curr.cost;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    if (!vis[e.dst]) {
                        pq.add(new pair(e.dst, e.wt));
                    }
                }
            }
        }
        System.out.println(fcost);

    }

    public static void main(String args[]) {
        int v = 9;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        prim(graph, v);
    }
}
