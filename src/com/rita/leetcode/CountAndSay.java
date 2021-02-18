package com.rita.leetcode;

import java.util.*;


/**
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class CountAndSay {

    public String countAndSay_2(int n) {
        String result = "1";

        if (n > 1) {
            for (int i = 1; i < n; i++) {

                int currentIndex;
                int priorIndex = 0;
                int count;

                StringBuffer cache = new StringBuffer();

                int length = result.length();
                for (currentIndex = 1; currentIndex < length; currentIndex++) {
                    if (result.charAt(currentIndex) != result.charAt(priorIndex)) {
                        count = currentIndex - priorIndex;
                        cache.append(count).append(result.charAt(priorIndex));

                        priorIndex = currentIndex;
                    }
                }

                if (priorIndex != currentIndex) {
                    count = currentIndex - priorIndex;
                    cache.append(count).append(result.charAt(priorIndex));
                }

                result = cache.toString();
                cache.setLength(0);
            }
        }
        return result;
    }

    public String countAndSay_1(int n) {

        String result = "1";

        if (n < 1) {
            return "";
        } else if (n == 1) {
            return result;
        } else {
            List<Map.Entry<Character, Integer>> list = new ArrayList<>();
            StringBuffer cache = new StringBuffer();

            for (int i = 1; i < n; i++) {

                for (int j = 0; j < result.length(); j++) {
                    char c = result.charAt(j);

                    Map.Entry<Character, Integer> tail = getTail(list);
                    if (tail != null && tail.getKey() == c) {
                        tail.setValue(tail.getValue() + 1);
                        list.set(list.size() - 1, tail);
                    } else {
                        Map<Character, Integer> map = new HashMap<>();
                        map.put(c, 1);
                        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
                        for (Map.Entry<Character, Integer> entry : entrySet) {
                            list.add(entry);
                        }
                    }
                }

                if (list.size() > 0) {
                    for (Map.Entry<Character, Integer> item : list) {
                        cache.append(item.getValue()).append(item.getKey());
                    }

                    result = cache.toString();

                    cache.setLength(0);
                    list.clear();
                }
            }
        }
        return result;
    }

    private Map.Entry<Character, Integer> getTail(List<Map.Entry<Character, Integer>> list) {
        if (list.size() < 1) {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        String result = new CountAndSay().countAndSay_2(5);
        System.out.println(result);
    }
}
