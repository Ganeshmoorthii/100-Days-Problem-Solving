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
    Set<Integer> to_del;
    List<TreeNode> res;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        to_del = new HashSet<>();
        res = new ArrayList<>();
        for(int i:to_delete)
            to_del.add(i);
        helper(root, true);
        return res;
    }
    private TreeNode helper(TreeNode node, boolean is_root){
        if(node == null) return null;
        boolean del = to_del.contains(node.val);
        if(is_root && !del) res.add(node);
        node.left = helper(node.left, del);
        node.right = helper(node.right, del);
        return del ? null : node;
    }
}
