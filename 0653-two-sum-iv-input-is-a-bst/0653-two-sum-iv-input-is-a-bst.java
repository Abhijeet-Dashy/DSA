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
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        // If complement is found, return true
        if (set.contains(k - root.val)) return true;
        // Otherwise, add current node value to the set
        set.add(root.val);
        // Recurse on left and right subtrees
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}