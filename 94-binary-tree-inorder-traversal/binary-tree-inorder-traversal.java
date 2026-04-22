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

    private void inorder(TreeNode current){
        if (current.left != null) inorder(current.left);
        traversal.add(current.val);
        if (current.right != null) inorder(current.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return traversal;
        inorder(root);
        return traversal;
        
    }
}