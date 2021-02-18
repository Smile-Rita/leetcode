package com.rita.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char sChar : sChars) {
            if (map.containsKey(sChar)) {
                map.put(sChar, map.get(sChar) + 1);
            } else {
                map.put(sChar, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int times = 0;

            Map.Entry<Character, Integer> next = iterator.next();

            for (char tChar : tChars) {
                if (tChar == next.getKey()) {
                    times++;
                }
            }

            if (times != next.getValue()) {
                return false;
            }
        }
        return true;
    }
}
