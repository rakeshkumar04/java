package Graph;

import java.util.*;

public class Graph {
    LinkedList<Integer> [] adj;

    public Graph(int nodes){
        this.adj = new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    public void show(){
        for(int i=0;i<adj.length;i++){
            System.out.print("The Adjacency of "+i+" : ");
            for(int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j)+" ");
            }
            System.out.println(" ");
        }
    }

    
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        g.show();
    }
}
