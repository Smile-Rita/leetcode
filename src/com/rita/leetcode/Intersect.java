package com.rita.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums2[j]);

                    int[] cacheList = new int[nums2.length - 1];

                    for (int m = 0; m < cacheList.length; m++) {
                        if (m >= j) {
                            cacheList[m] = nums2[m + 1];
                        } else {
                            cacheList[m] = nums2[m];
                        }
                    }

                    nums2 = cacheList;
                    break;
                }
            }
        }

        int[] resultList = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultList[i] = list.get(i);
        }

        return resultList;
    }

}
