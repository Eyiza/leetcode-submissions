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

    private void preorder(TreeNode current){
        traversal.add(current.val);
        if (current.left != null) preorder(current.left);
        if (current.right != null) preorder(current.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return traversal;
        preorder(root);
        return traversal;
    }
}