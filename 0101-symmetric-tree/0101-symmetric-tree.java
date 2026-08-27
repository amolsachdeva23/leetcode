/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
       temp(root.right);
        return isSameTree(root.right,root.left);
    }
    public TreeNode temp(TreeNode root){
        if(root==null) return null;
        
        temp(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        temp(root.right);
        return root; 
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if (p == null && q == null) return true;
       if (p == null || q == null) return false;
       return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}