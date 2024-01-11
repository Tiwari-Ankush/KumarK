problem:



soln:
```
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
    int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return maxDiff;
    }

    private void dfs(TreeNode node, int min, int max) {
        if (node == null) {
            return;
        }

        // Calculate the absolute difference between the current node's value and the min/max values
        int diff1 = Math.abs(node.val - min);
        int diff2 = Math.abs(node.val - max);

        // Update the global maxDiff
        maxDiff = Math.max(maxDiff, Math.max(diff1, diff2));

        // Update min and max for the child nodes
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);

        // Recursively visit left and right children
        dfs(node.left, min, max);
        dfs(node.right, min, max);
    }
}
```