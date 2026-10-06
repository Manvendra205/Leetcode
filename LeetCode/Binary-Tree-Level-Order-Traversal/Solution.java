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
18    public List<List<Integer>> levelOrder(TreeNode root) {
19        List<List<Integer>> result = new ArrayList<>();
20        if (root == null) return result;
21
22        Queue<TreeNode> queue = new LinkedList<>();
23        queue.add(root);
24
25        while (!queue.isEmpty()) {
26            int size = queue.size();
27            List<Integer> level = new ArrayList<>();
28
29            for (int i = 0; i < size; i++) {
30                TreeNode node = queue.poll();
31                level.add(node.val);
32
33                if (node.left != null) queue.add(node.left);
34                if (node.right != null) queue.add(node.right);
35            }
36
37            result.add(level);
38        }
39        return result;
40    }
41}