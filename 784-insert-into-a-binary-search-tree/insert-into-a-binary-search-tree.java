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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if (root == null) return new TreeNode(val);
        TreeNode run = root;
        TreeNode result = root;
        while (run != null) {
            if (run.val == val) return result;
            else if (val < run.val) {
                if (run.left == null) {
                    run.left = new TreeNode(val);
                    return result;
                }
                run = run.left;
            }
            else {
                if (run.right == null) {
                    run.right = new TreeNode(val);
                    return result;
                }
                run = run.right;
            }
        }
        return result;
    }
}