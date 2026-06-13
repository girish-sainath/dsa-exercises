import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<LinkedList<Node>> adjacencyList;

    Graph() {
        adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjacencyList.add(currentList);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currentList = adjacencyList.get(src);
        Node destNode = adjacencyList.get(dest).getFirst();
        currentList.add(destNode);
    }

    public boolean checkEdge(int src, int dest) {
        LinkedList<Node> currentList = adjacencyList.get(src);
        Node destNode = adjacencyList.get(dest).getFirst();

        for (Node node : currentList) {
            if (node == destNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList : adjacencyList) {
            for (Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}