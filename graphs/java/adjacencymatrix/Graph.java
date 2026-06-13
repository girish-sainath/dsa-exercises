public class Graph {

    int[][] adjacencyMatrix;

    Graph(int size) {
        adjacencyMatrix = new int[size][size];
    }

    public void addNode(Node node) {
        
    }

    public void addEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest) {
        return adjacencyMatrix[src][dest] == 1;
    }

    public void printGraph() {
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {

            }
        }
    }

}
