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
    public boolean check(TreeNode root,TreeNode left,TreeNode right){
        System.out.println("called");
        if(root==null){
            return true;
        }

        if(left!=null && root.val<=left.val) return false;
        if(right!=null && root.val>=right.val) return false;

        
        
        return check(root.right,root,right) && check(root.left,left,root);

    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root,null,null);

    }
}