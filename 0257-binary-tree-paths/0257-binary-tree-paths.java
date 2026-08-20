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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, "", result);
        }
        return result;
    }

    private void dfs(TreeNode node, String currentPath, List<String> result) {
        // Append the current node's value to the path string
        currentPath += node.val;

        // Leaf node detection: if it has no children, save the path
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }

        // Recursively traverse the left and right subtrees with the delimiter
        if (node.left != null) {
            dfs(node.left, currentPath + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, currentPath + "->", result);
        }
    }
}