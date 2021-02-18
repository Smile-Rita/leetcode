package com.rita.leetcode;

import java.util.*;

/**
 * 找出数组中重复的数字。
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * @author yaoyuying
 * @version 1.0
 * @date 1/20/21 11:22 AM
 */
public class FindRepeatNumber {
    public int solution(int[] nums) {

        // 遍历数组, 利用set不可重复性
        HashSet set = new HashSet();
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return -1;
    }
}
