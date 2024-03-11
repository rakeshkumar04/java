package Graph;

public class GraphDSA {
    int[][] adjMat;

    public GraphDSA(int Nodes){
        this.adjMat = new int[Nodes][Nodes];
    }

    public void addEdge(int u, int v){
        this.adjMat[u][v] = 1;
        this.adjMat[v][u] = 1;
    }

    public void display(){
        for(int i=0 ; i<adjMat.length ; i++){
            for(int j=0;j<adjMat.length;j++){
                System.out.print(adjMat[i][j]+" ");
            }    
            System.out.println(" ");    
        }
    }

    public static void main(String[] args) {
        GraphDSA g = new GraphDSA(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        g.display();
    }
}
