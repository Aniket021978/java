
//IF GRAPH IS DISCONNECTED:::::::
//eg 0-1-2
//   3-4

// import java.util.*;
// public class bfs{
//     static class edge{
//         int src;
//         int dest;
//         public edge(int s,int d){
//             this.src=s;
//             this.dest=d;
//         }
//     }
//     public static void cg(ArrayList<edge> graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<edge>();
//         }
//         graph[0].add(new edge(0,1));
//         graph[0].add(new edge(0,2));

//         graph[1].add(new edge(1,3));

//         graph[2].add(new edge(2,4));

//         graph[3].add(new edge(3,4));
//         graph[3].add(new edge(3,5));
//         graph[4].add(new edge(4,5));
//         graph[5].add(new edge(5,6));
//     }
//     public static void bfs(ArrayList<edge> graph[],int v,boolean vis[],int start){
//         Queue<Integer> q=new LinkedList<>();
//         q.add(start);
//         while(!q.isEmpty()){
//             int c=q.remove();
//             if(vis[c]==false){
//                 System.out.println(c);
//                 vis[c]=true;
//                 for(int i=0;i<graph[c].size();i++){
//                     edge e=graph[c].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         int v=7;
//         ArrayList<edge> graph[]=new ArrayList[v];
//         cg(graph);
//         boolean vis[]=new boolean[v];
//         for(int i=0;i<v;i++){
//             if(vis[i]==false){
//                 bfs(graph,v,vis,i);
//             }
//         }
//     }
// }

//-------------------------------------------------------------------
//if graph is complete
//eg 0-1-2-3-4

import java.util.*;

public class bfs {
    static class edge {
        int src;
        int dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void cg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));
        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 6));
    }

    public static void bfs(ArrayList<edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean vis[] = new boolean[v];
        while (!q.isEmpty()) {
            int c = q.remove();
            if (vis[c] == false) {
                System.out.println(c);
                vis[c] = true;
                for (int i = 0; i < graph[c].size(); i++) {
                    edge e = graph[c].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        cg(graph);
        bfs(graph, v);
    }
}