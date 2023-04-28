package Blind75.Medium;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneNode {
    Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        if(visited.containsKey(node)) return visited.get(node);

        Node cloneNode = new Node(node.val, new ArrayList<>());

        visited.put(node, cloneNode);

        for(Node child: node.neighbors){
            cloneNode.neighbors.add(cloneGraph(child));
        }
        return visited.get(node);
    }

    /*
    Time complexity : O(V+E)
    Space complexity : O(V)
     */
}
