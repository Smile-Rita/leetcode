package com.rita.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {

        Set<Character> cacheSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;

            char c1 = s.charAt(i);
            if (cacheSet.add(c1)) {
                for (int j = i + 1; j < s.length(); j++) {
                    char c2 = s.charAt(j);

                    if (c1 == c2) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    return i;
                }
            }
        }
        return -1;
    }
}
