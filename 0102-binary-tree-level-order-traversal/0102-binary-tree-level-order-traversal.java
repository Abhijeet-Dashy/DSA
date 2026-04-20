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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            int lvlSize = qu.size();
            List<Integer> currlvl = new ArrayList<>();
            for(int i = 0; i<lvlSize; i++){
                TreeNode curr = qu.poll();
                currlvl.add(curr.val);
                if(curr.left != null){
                    qu.offer(curr.left);
                }
                if(curr.right != null){
                    qu.offer(curr.right);
                }
            }
            res.add(currlvl);
        }
        return res;
    }
}