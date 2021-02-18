package com.rita.leetcode;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author yaoyuying
 * @version 1.0
 */
public class ClimbStairs {

    public int climbStairs(int n) {

        if (n < 1) {
            return 0;
        }

        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;
        int temp = 0;

        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
