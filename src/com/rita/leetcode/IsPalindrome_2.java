package com.rita.leetcode;

/**
 * 验证回文字符串 和 字符串转换整数（atoi）
 *
 * @author yaoyuying
 * @version 1.0
 */
public class IsPalindrome_2{

    public boolean isPalindrome(String s) {

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            int item = (int) s.charAt(i);

            if ((item >= 'a' && item <= 'a' + 25) || (item >= 'A' && item <= 'A' + 25) || (item >= '0' && item <= '0' + 9)) {
                buffer.append(s.charAt(i));
            }
        }

        if (buffer.length() == 0) {
            return true;
        } else {
            for (int i = 0; i < buffer.length() / 2; i++) {
                char c1 = buffer.charAt(i);
                char c2 = buffer.charAt(buffer.length() - 1 - i);

                if (Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
