/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p == q) return p;
        if(p == root || q == root) return root;
        boolean leftp = contains(root.left , p);
        boolean rightq = contains(root.right, q);
        if(leftp == true && rightq == true) return root;
        if(leftp == false && rightq == false) return root;
        if(leftp == true && rightq == false) return lowestCommonAncestor(root.left, p, q);
        if(leftp == false && rightq == true) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public boolean contains(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
}