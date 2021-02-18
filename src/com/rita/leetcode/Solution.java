package com.rita.leetcode;

/**
 * @author yaoyuying
 * @version 1.0
 */
public class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode node_0 = new TreeNode(0);
        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_5 = new TreeNode(5);
        TreeNode node_6 = new TreeNode(6);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(8);

        node_3 = getNode(node_3, node_5, node_1);
        node_5 = getNode(node_5, node_6, node_2);
        node_2 = getNode(node_2, node_7, node_4);
        node_1 = getNode(node_1, node_0, node_8);

        TreeNode node = lowestCommonAncestor(node_3, node_6, node_4);
        System.out.println(node.val);


//        ArrayList<Integer> list = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(node_3);
//
//        while (!queue.isEmpty()) {
//            TreeNode poll = queue.poll();
//            list.add(poll.val);
//
//            if (poll.left != null) {
//                queue.offer(poll.left);
//            }
//
//            if (poll.right != null) {
//                queue.offer(poll.right);
//            }
//        }
//
//        String result = list.stream().map(m -> m.toString()).collect(Collectors.joining(","));
//        System.out.println(result);
    }

    private static TreeNode getNode(TreeNode root, TreeNode left, TreeNode right) {
        root.left = left;
        root.right = right;
        return root;
    }

}


