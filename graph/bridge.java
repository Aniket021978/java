import java.util.*;

public class bridge {
    static class edge {
        int src;
        int dst;

        public edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    public static void cg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[], int d[], int t[], int p, int time) {
        vis[curr] = true;
        d[curr] = t[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (e.dst == p) {
                continue;
            } else if (!vis[e.dst]) {
                dfs(graph, e.dst, vis, d, t, curr, time);
                t[curr] = Math.min(t[curr], t[e.dst]);
                if (d[curr] < t[e.dst]) {
                    System.out.println(e.src + " " + e.dst);
                }
            } else {
                t[curr] = Math.min(t[curr], d[e.dst]);
            }
        }
    }

    public static void bridge(ArrayList<edge> graph[], int v) {
        int d[] = new int[v];
        int t[] = new int[v];
        boolean vis[] = new boolean[v];
        int time = 0;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, d, t, -1, time);
            }
        }
    }

    public static void main(String args[]) {
        int v = 9;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        bridge(graph, v);
    }
}
