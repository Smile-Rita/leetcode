package com.rita.leetcode;

/**
 * 二维数组中的查找
 * <p>
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author yaoyuying
 * @version 1.0
 * @date 1/21/21 5:44 PM
 */
public class FindNumberIn2DArray {
    public boolean solution(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;

        while (row < rows && column >= 0) {
            int val = matrix[row][column];
            if (val == target) {
                return true;
            } else if (val > target) {
                row++;
            } else {
                column--;
            }
        }
        return false;

//        for (int i = 0; i < rows; i++) {
//            if (matrix[i][column] == target) {
//                return true;
//            }
//
//            if (matrix[i][matrix[i].length - 1] < target) {
//                continue;
//            }
//
//            for (int j = columns; j >= row; j--) {
//                if (matrix[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }

}
