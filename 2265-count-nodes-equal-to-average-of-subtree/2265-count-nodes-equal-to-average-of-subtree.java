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
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        int sum=sum(root);
        int c=count(root);
        int avg=sum/c;
        int m=(root.val==avg)?1:0;
        return m+ averageOfSubtree(root.right)+ averageOfSubtree(root.left);
    }
    private int sum(TreeNode root){
        int s=0;
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    private int count(TreeNode root){
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }
    // private int ans(TreeNode root,int t){
    //     if(root==null) return 0;
    //     int m=(root.val==t)?1:0;
    //     return m+ans(root.right,t)+ans(root.left,t);
    // }
}