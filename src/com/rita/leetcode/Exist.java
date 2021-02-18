package com.rita.leetcode;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
 * 每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 * <p>
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 * <p>
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 *
 * @author yaoyuying
 * @date 2021/02/04
 * @since 1.0
 */
public class Exist {

    public boolean solution(char[][] board, String word) {

        char[] chars = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (find(board, chars, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board, char[] chars, int i, int j, int k) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[i].length - 1 || board[i][j] != chars[k]) {
            return false;
        }

        if (k == chars.length - 1) {
            return true;
        }

        board[i][j] = ' ';
        boolean flag = find(board, chars, i + 1, j, k + 1) || find(board, chars, i - 1, j, k + 1) ||
                find(board, chars, i, j + 1, k + 1) || find(board, chars, i, j - 1, k + 1);

        board[i][j] = chars[k];
        return flag;
    }

}
