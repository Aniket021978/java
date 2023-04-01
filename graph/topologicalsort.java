import java.util.*;

public class topologicalsort {
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
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[], Stack<Integer> stack) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dst]) {
                dfs(graph, e.dst, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String args[]) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        Stack<Integer> stack = new Stack<>();
        cg(graph);
        boolean vis[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}