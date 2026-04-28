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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> traversal = new ArrayList<>();

        if (root == null) return traversal;
        stack.add(root);

        while(stack.size() > 0){
            // System.out.print(stack);
            TreeNode popped = stack.pop();
            traversal.add(popped.val);

            if (popped.right != null) stack.add(popped.right);
            if (popped.left != null) stack.add(popped.left);
        }

        return traversal;
        
    }
}