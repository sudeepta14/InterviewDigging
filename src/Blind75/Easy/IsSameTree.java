package Blind75.Easy;

import Blind75.Easy.Classes.TreeNode;

public class IsSameTree {
    public static void main(String[] args){

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
