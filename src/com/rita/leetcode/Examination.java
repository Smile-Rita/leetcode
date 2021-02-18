package com.rita.leetcode;

import java.util.*;

public class Examination {

    public void method(Integer[] values) {
        List<Integer> list = Arrays.asList(values);

        Map<Integer, Integer> map = new TreeMap<>();
        Set<Integer> keySet = map.keySet();

        for (int i = 0; i < list.size(); i++) {
            if (!keySet.contains(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        sort(map);
    }

    private void sort(Map<Integer, Integer> map) {

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> mapping : list) {
            System.out.println(mapping.getKey());
        }
    }


}
