package com.rita.leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index == i) {
                    index++;
                    continue;
                }

                nums[index] = nums[i];
                index++;
            }
        }

        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }

        return nums;
    }

}
