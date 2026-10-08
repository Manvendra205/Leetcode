1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        TreeNode curr = root;
14        while (curr != null) {
15            if (p.val < curr.val && q.val < curr.val) {
16                curr = curr.left;
17            } else if (p.val > curr.val && q.val > curr.val) {
18                curr = curr.right;
19            } else {
20                return curr;
21            }
22        }
23        return null;
24    }
25}