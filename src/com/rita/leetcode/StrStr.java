package com.rita.leetcode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class StrStr {
    public int strStr(String haystack, String needle) {

        int length1 = haystack.length();
        int length2 = needle.length();

        if (0 == length2) {
            return 0;
        }

        if (length1 < length2) {
            return -1;
        }

        for (int i = 0; i < length1; i++) {

            if ((length1 - i) < length2) {
                return -1;
            }

            int index = i;
            boolean flag = true;

            for (int j = 0; j < length2; j++) {

                if (haystack.charAt(index) != needle.charAt(j)) {
                    flag = false;
                    break;
                } else {
                    index = index + 1;
                }
            }

            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
