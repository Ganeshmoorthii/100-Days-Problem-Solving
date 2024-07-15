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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int[] arr : descriptions){
            int parent = arr[0], child = arr[1],is_left = arr[2];
            set.add(child);
            TreeNode curr = map.getOrDefault(parent, new TreeNode(parent));
            if(is_left == 1){
                curr.left = map.getOrDefault(child,new TreeNode(child));
                map.put(child,curr.left);
            }
            else{
                curr.right = map.getOrDefault(child,new TreeNode(child));
                map.put(child,curr.right);
            }
            map.put(parent,curr);
        }
        int key = 1;
        for(int[] val : descriptions){
            int parent = val[0];
            if(!set.contains(parent)){
                key = parent;
            }
        }
        return map.get(key);
    }
}
