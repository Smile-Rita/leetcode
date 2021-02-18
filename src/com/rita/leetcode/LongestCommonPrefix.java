package com.rita.leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 ""。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length < 1) {
            return "";
        }

        int minLength = strs[0].length();


        for (int i = 1; i < strs.length; i++) {
            int length = strs[i].length();
            if (minLength > length) {
                minLength = length;
            }
        }

        StringBuffer result = new StringBuffer();

        boolean flag = true;

        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }
            result.append(c);
        }
        return result.toString();
    }
}
