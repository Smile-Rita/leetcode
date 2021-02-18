package com.rita.leetcode;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class ReverseString {
    public void reverseString(char[] s) {
        char item;

        for (int i = 0; i < s.length / 2; i++) {
            item = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = item;
        }
    }
}
