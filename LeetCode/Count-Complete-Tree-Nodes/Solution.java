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
16class Solution {
17    public int countNodes(TreeNode root) {
18        if (root == null) return 0;
19
20        int leftHeight = 0, rightHeight = 0;
21        TreeNode l = root, r = root;
22
23        while (l != null) { leftHeight++; l = l.left; }
24        while (r != null) { rightHeight++; r = r.right; }
25
26        if (leftHeight == rightHeight) return (1 << leftHeight) - 1;
27
28        return 1 + countNodes(root.left) + countNodes(root.right);
29    }
30}