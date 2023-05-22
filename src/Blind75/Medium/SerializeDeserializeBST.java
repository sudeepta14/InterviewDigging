package Blind75.Medium;

import Blind75.Easy.Classes.TreeNode;

import java.util.*;

public class SerializeDeserializeBST {
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    public void buildString(TreeNode root, StringBuilder sb){
        if(root == null) return;
        sb.append(root.val).append(',');
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode buildTree(Queue<String> queue, int lower, int upper){
        if(queue.isEmpty()) return null;
        String data = queue.peek();
        int val = Integer.valueOf(data);
        if((val < lower) || (val > upper)) return null;
        queue.poll();
        TreeNode node = new TreeNode(val);
        node.left = buildTree(queue, lower, val);
        node.right = buildTree(queue, val, upper);
        return node;
    }
}
