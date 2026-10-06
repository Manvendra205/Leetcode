1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17class Solution {
18    public boolean isSymmetric(TreeNode root) {
19        if (root == null) return true;
20        return isMirror(root.left, root.right);
21    }
22
23    private boolean isMirror(TreeNode a, TreeNode b) {
24        if (a == null && b == null) return true;
25        if (a == null || b == null) return false;
26        if (a.val != b.val) return false;
27
28        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
29    }
30}