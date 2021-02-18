package com.rita.leetcode;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (nums[i] == nums[j]) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                result = nums[i];
            } else {
                continue;
            }
        }
        return result;
    }

}
