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
        Queue<TreeNode> Q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Q.offer(root);
        while(!Q.isEmpty()){
            int size = Q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<size;i++){
                TreeNode node = Q.poll();
                level.add(node.val);
                if(node.left != null){
                    Q.offer(node.left);
                }
                if(node.right != null){
                    Q.offer(node.right);
                }
            }
            res.add(level);
        }
        return res; 
        
    }
}
