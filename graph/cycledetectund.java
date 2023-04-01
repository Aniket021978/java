import java.util.*;
public class cycledetectund {
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
        graph[0].add(new edge(0, 4));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 4));
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 4));
    }

    public static boolean dfs(ArrayList<edge> graph[], boolean vis[], int curr, int p) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (vis[curr]==true && p!=e.dst) {
                return true;
            } else if (!vis[e.dst] && (dfs(graph, vis, e.dst, curr)==true)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int v = 11;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        boolean vis[]=new boolean[v];
        System.out.println((dfs(graph, vis, 0, -1)));     
    }
}
