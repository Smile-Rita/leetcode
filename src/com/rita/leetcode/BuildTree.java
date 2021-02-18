package com.rita.leetcode;

import com.rita.demo.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * @author yaoyuying
 * @version 1.0
 * @date 1/28/21 9:35 AM
 */
public class BuildTree {
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode solution(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        // 构造中序遍历的哈希映射，以便于快速定位根节点
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    /**
     * @param preorder       前序遍历 数组
     * @param inorder        中序遍历 数组
     * @param preorder_left  前序遍历 左边界
     * @param preorder_right 前序遍历 右边界
     * @param inorder_left   中序遍历 左边界
     * @param inorder_right  中序遍历 右边界
     * @return leetcode.common.TreeNode
     * @description
     * @author yaoyuying
     * @date 2021/01/28 5:10 PM
     */
    private TreeNode buildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right,
                               int inorder_left, int inorder_right) {

        if (preorder_left > preorder_right) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int preorder_root = preorder_left;

        // 确定中序遍历中的根节点位置
        int inorder_root = inorderMap.get(preorder[preorder_root]).intValue();
        // 构建根节点树
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // 计算左子树的节点数目
        int left_node_num = inorder_root - inorder_left;

        // 递归的构建左子树，并连接到根节点
        // 前序遍历中 [从 根节点+1 到 根节点+left_node_num] 个元素对应了 中序遍历中 [从 左边界 到 根节点-1] 的元素
        root.left = buildTree(preorder, inorder, preorder_root + 1, preorder_root + left_node_num, inorder_left, inorder_root - 1);

        // 递归的构建右子树，并连接到根节点
        // 前序遍历中 [从 根节点+left_node_num 到 右边界] 的元素对应了 中序遍历中 [从 根节点+1 到 右边界] 的元素
        root.right = buildTree(preorder, inorder, preorder_left + left_node_num + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }
}
