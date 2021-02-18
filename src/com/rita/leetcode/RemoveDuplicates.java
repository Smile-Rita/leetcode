package com.rita.leetcode;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (!haveRepetition(len, num, nums)) {
                int a = nums[len];
                nums[len] = nums[i];
                nums[i] = a;
                len++;
            }
        }
        System.out.println(len);
        return len;
    }

    private boolean haveRepetition(int len, int num, int[] nums) {
        for (int j = 0; j < len; j++) {
            if (num == nums[j]) {
                return true;
            }
        }
        return false;
    }

}
