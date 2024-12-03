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
    public TreeNode createTree(int[] arr,int start,int end){
        if(start>end){
            return null;
        }

        int mid = (start+end)/2;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = createTree(arr,start,mid-1);
        root.right = createTree(arr,mid+1,end);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums,0,nums.length-1);
        
    }
}