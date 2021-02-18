package com.rita.leetcode;

/**
 * 插入排序
 *
 * @author yaoyuying
 * @date 2021/02/04
 * @since 1.0
 */
public class InsertionSort {

    public int[] sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            for (int j = i - 1; j > -1; j--) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }else {
                    break;
                }
            }
        }
        return nums;
    }
}
