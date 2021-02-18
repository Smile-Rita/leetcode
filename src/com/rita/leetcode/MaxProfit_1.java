package com.rita.leetcode;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class MaxProfit_1 {

    public int maxProfit(int[] prices) {
        int min = 0;
        // 状态值（false：未买入；true：已买入）
        boolean flag = false;
        int result = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int current = prices[i];
            int after = prices[i + 1];

            if (flag) {
                // 若前一个数字比后一个数字大，则不出手，并将小的那个数字
                if (current > after) {
                    result += (current - min);
                    flag = false;
                }
            } else {
                if (current < after) {
                    min = current;
                    flag = true;
                }
            }
        }

        if (flag) {
            int last = prices[prices.length - 1];
            if (last > min) {
                result += (last - min);
            }
        }
        return result;
    }

}
