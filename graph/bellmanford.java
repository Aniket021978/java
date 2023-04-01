import java.util.*;
public class bellmanford{
    static class edge{
        int src;
        int dst;
        int wt;

        public edge(int s,int d,int w){
            this.src=s;
            this.dst=d;
            this.wt=w;
        }
    }
    public static void cg(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));
        graph[1].add(new edge(1,2,-4));
        graph[2].add(new edge(2,3,2));
        graph[3].add(new edge(3,4,4));
        graph[4].add(new edge(4,1,-10));
    }
    public static void bell(ArrayList<edge> graph[],int src,int v){
        int dis[]=new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<v-1;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<graph[i].size();j++){
                    edge e=graph[i].get(j);
                    int u=e.src;
                    int a=e.dst;
                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+e.wt<dis[a]){
                        dis[a]=dis[u]+e.wt;
                    }
                }
            }
        }

        //to check negative cycle in graph bcoz bellman fails at there
            for(int i=0;i<v;i++){
                for(int j=0;j<graph[i].size();j++){
                    edge e=graph[i].get(j);
                    int u=e.src;
                    int a=e.dst;
                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+e.wt<dis[a]){
                        System.out.println("negative cycle foud");
                    }
                }
            }
        for(int i=0;i<v-1;i++){
        System.out.print(dis[i]+" ");
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<edge> graph[]=new ArrayList[v];
        cg(graph);
        bell(graph,0,v);
    }
}