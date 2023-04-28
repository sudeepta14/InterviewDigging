package Blind75.Medium;
import Blind75.Easy.Classes.TreeNode;

import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;

        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> row = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                row.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(row);
        }
        return result;
    }
}

/*
time complexity : O(N)
space complexity: O(N)
 */
