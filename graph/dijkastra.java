import java.util.*;

public class dijkastra{
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
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 3, 7));
        graph[1].add(new edge(1, 2, 1));

        graph[2].add(new edge(2, 4, 3));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));
    }

    public static class pair implements Comparable<pair> {
        int node;
        int dis;

        public pair(int n, int d) {
            this.node = n;
            this.dis = d;
        }

        @Override
        public int compareTo(pair p2) {
            return this.dis - p2.dis;
        }
    }

    public static void bfs(ArrayList<edge> graph[],int src,int v){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[v];
        int dis[]=new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
            pair p=pq.remove();
            if(!vis[p.node]){
                vis[p.node]=true;
                for(int i=0;i<graph[p.node].size();i++){
                    edge e=graph[p.node].get(i);
                    int u=e.src;
                    int a=e.dst;
                    if(dis[u]+e.wt<dis[a]){
                    dis[a]=dis[u]+e.wt;
                    pq.add(new pair(a,dis[a]));
                    }
                }

            }
        }
        for(int i=0;i<v;i++){
            System.out.print(dis[i]+" ");
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<edge> graph[]=new ArrayList[v]; 
        cg(graph);
        bfs(graph,0,v);
    }
}

