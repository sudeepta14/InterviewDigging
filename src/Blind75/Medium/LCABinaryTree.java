package Blind75.Medium;

import Blind75.Easy.Classes.TreeNode;

public class LCABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val > root.val && q.val > root.val){
                root = root.right;
            }else if(p.val < root.val && q.val < root.val){
                root = root.left;
            }else{
                return root; // returns when one is parent of the other or the point where both are not part of same subtree
            }
        }
        return null;
    }
}
/*
Time complexity : O(n) -- worst case we can visit all the nodes of the tree of "n" elements
Space complexity : O(1)
 */