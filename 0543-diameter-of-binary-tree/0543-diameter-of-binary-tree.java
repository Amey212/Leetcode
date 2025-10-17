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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        AtomicInteger ans = new AtomicInteger(0);
        findHeight(root, ans);
        return ans.get();
    }

    private int findHeight(TreeNode root, AtomicInteger ans){
        if(root == null) return 0;
        int lh = findHeight(root.left, ans);
        int rh = findHeight(root.right, ans);
        ans.set(Math.max(ans.get(), lh+rh));
        return 1 + Math.max(lh, rh);
    }
}