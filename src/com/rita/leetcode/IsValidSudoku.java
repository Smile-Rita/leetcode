package com.rita.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        Set hashSet = new HashSet();

        //1. 数字 1-9 在每一行只能出现一次。
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if ('.' == board[i][j]) {
                    continue;
                }
                if (!hashSet.add(board[i][j])) {
                    return false;
                }
            }
            hashSet.clear();
        }

        //2. 数字 1-9 在每一列只能出现一次。
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if ('.' == board[j][i]) {
                    continue;
                }
                if (!hashSet.add(board[j][i])) {
                    return false;
                }
            }
            hashSet.clear();
        }

        int x_start = 0;
        int y_start = 0;

        //3. 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
        for (int a = 0; a < 9; a++) {
            int times = a % 3;
            if (times == 0 && a != 0) {
                x_start += 3;
                y_start = 0;
            } else {
                y_start = 3 * times;
            }

            for (int i = x_start; i < x_start + 3; i++) {
                for (int j = y_start; j < y_start + 3; j++) {

                    if ('.' == board[i][j]) {
                        continue;
                    }
                    if (!hashSet.add(board[i][j])) {
                        return false;
                    }
                }
            }
            hashSet.clear();
        }
        return true;
    }

}
