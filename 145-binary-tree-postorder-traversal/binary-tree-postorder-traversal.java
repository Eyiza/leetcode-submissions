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
    private List<Integer> traversal = new ArrayList<>();

    private void postorder(TreeNode current){
        if (current.left != null) postorder(current.left);
        if (current.right != null) postorder(current.right);
        traversal.add(current.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return traversal;
        postorder(root);
        return traversal;
    }
}