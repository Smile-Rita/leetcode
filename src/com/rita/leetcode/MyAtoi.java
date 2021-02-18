package com.rita.leetcode;

/**
 * 实现一个 atoi 函数，使其能将字符串转换成整数。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class MyAtoi {

    public int myAtoi(String str) {

        int result;
        boolean isNegative = false;
        boolean flag = false;

        StringBuffer buffer = new StringBuffer();

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (0 == buffer.length()) {
                    continue;
                } else {
                    break;
                }
            } else if ('-' == c) {
                if (0 == buffer.length()) {
                    buffer.append(c);
                    isNegative = true;
                } else {
                    break;
                }
            } else if ('+' == c) {
                if (0 == buffer.length()) {
                    buffer.append(c);
                    isNegative = false;
                } else {
                    break;
                }
            } else if ((int) c >= '0' && (int) c <= '0' + 9) {
                buffer.append(c);
                flag = true;
            } else {
                if (0 == buffer.length()) {
                    return 0;
                } else {
                    break;
                }
            }
        }

        if (!flag) {
            return 0;
        }

        try {
            result = Integer.parseInt(buffer.toString());
        } catch (NumberFormatException e) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return result;
    }
}
