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
    
    private TreeNode copyTreeNode(TreeNode original){
        if(original == null) return null;
        TreeNode copy = new TreeNode(original.val);
        copy.right = copyTreeNode(original.left);
        copy.left = copyTreeNode(original.right);

        return copy;
    }

    public TreeNode invertTree(TreeNode root) {
        return copyTreeNode(root);
    }
}