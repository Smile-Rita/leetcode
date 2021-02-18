package com.rita.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Rotate
 *
 * @author yaoyuying
 * @version 1.0
 */
public class Rotate {

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     * @author yaoyuying
     * @version 1.0
     */
    public void rotate(int[] nums, int k) {

        // 向右移动几次
        for (int i = 0; i < k; i++) {
            // 移动位
            int a = 0;
            // 暂存位
            int b = 0;

            for (int j = 0; j < nums.length - 1; j++) {
                if (j == 0) {
                    a = nums[j];
                    nums[0] = nums[nums.length - 1];
                } else {
                    a = b;
                }
                b = nums[j + 1];
                nums[j + 1] = a;
            }
        }
    }

    /**
     * 给定一个 n × n 的二维矩阵表示一个图像。
     * <p>
     * 将图像顺时针旋转 90 度。
     *
     * @author yaoyuying
     * @version 1.0
     */
    public int[][] rotate(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = matrix.length - 1; i > -1; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = list.get(j + i * matrix[i].length);
            }
        }
        return matrix;
    }

}


