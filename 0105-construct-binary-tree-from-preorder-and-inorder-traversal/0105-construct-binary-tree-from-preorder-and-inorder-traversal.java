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
    public TreeNode buildTree(int[] pre, int[] in) {
        if(pre.length == 0) return null;

        int r = pre[0];
        int idx = 0;
        for(int i = 0; i<in.length; i++){
            if(in[i] == r) idx = i;
        }
        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(pre, 1, idx+1), Arrays.copyOfRange(in, 0, idx));
        node.right = buildTree(Arrays.copyOfRange(pre, idx+1, pre.length), Arrays.copyOfRange(in, idx+1, in.length));
        return node;
    }
}