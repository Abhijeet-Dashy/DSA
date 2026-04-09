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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minIndex = queue.peek().index; // normalize

            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                int currIndex = p.index - minIndex; // normalize

                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (p.node.left != null) {
                    queue.offer(new Pair(p.node.left, 2 * currIndex));
                }

                if (p.node.right != null) {
                    queue.offer(new Pair(p.node.right, 2 * currIndex + 1));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}

// helper class
class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}