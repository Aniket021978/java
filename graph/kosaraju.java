import java.util.*;

public class kosaraju {
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
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 4));

    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dst]) {
                dfs(graph, e.dst, vis);
            }
        }
    }

    public static void topo(ArrayList<edge> graph[], int curr, Stack<Integer> s, boolean vis[]) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dst]) {
                topo(graph, e.dst, s, vis);
            }
        }
        s.push(curr);
    }

    public static void koja(ArrayList<edge> graph[], int v) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topo(graph, i, s, vis);
            }
        }
        ArrayList<edge> trans[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            trans[i] = new ArrayList<edge>();
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                trans[e.dst].add(new edge(e.dst, e.src));
            }
        }
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                dfs(trans, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        koja(graph, v);
    }
}
