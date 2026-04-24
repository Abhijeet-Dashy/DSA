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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode n){
        if(n == null) return 0;

        int l = helper(n.left);
        l = Math.max(l,0);
        int r = helper(n.right);
        r = Math.max(r,0);

        int maxi = l+r+n.val;
        ans = Math.max(ans,maxi);

        return Math.max(l,r)+n.val;

    }
}