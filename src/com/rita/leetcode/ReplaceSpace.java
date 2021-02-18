package com.rita.leetcode;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * @author yaoyuying
 * @version 1.0
 * @date 1/22/21 5:21 PM
 */
public class ReplaceSpace {
    public String solution(String s) {
        StringBuffer buffer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                buffer.append("%20");
            } else {
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
