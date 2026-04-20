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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty()){
            int lvlSize = qu.size();
            double avglvl = 0;
            for(int i = 0; i<lvlSize; i++){
                TreeNode curr = qu.poll();
                avglvl += curr.val;
                if(curr.left != null){
                    qu.offer(curr.left);
                }
                if(curr.right != null){
                    qu.offer(curr.right);
                }
            }
            avglvl = avglvl/lvlSize;
            res.add(avglvl);
        }
        return res;
    }
}