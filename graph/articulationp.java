import java.util.ArrayList;

public class articulationp {
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
        graph[4].add(new edge(4, 3));

    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[], int dis[], int low[], int p, int time) {
        vis[curr] = true;
        int child = 0;
        dis[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (p == e.dst) {
                continue;
            } else if (vis[e.dst]) {
                low[curr] = Math.min(low[curr], dis[e.dst]);
            } else {
                dfs(graph, e.dst, vis, dis, low, curr, time);
                low[curr] = Math.min(low[curr], low[e.dst]);
                if (dis[curr] <= low[e.dst] && p != -1) {
                    System.out.println(curr);
                }
                child++;
            }
        }
        if (p == -1 && child > 1) {
            System.out.println(curr);
        }
    }

    public static void art(ArrayList<edge> graph[], int v) {
        boolean vis[] = new boolean[v];
        int dis[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, dis, low, -1, time);
            }
        }
    }

    public static void main(String args[]) {
        int v = 10;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        art(graph, v);
    }
}