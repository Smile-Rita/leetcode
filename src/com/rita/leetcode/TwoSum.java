package com.rita.leetcode;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 *
 * @author yaoyuying
 * @date 2021/02/18
 * @since 1.0
 */
public class TwoSum {

    public int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int i1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int i2 = nums[j];
                if (i1 == i2) {
                    continue;
                }

                if (target == i1 + i2) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
