package com.rita.leetcode;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * @author yaoyuying
 * @date 2021/02/02
 * @since 1.0
 */
public class NumWays {

    public int solution(int n) {

        if (n < 2) {
            return 1;
        }

        int result = 0;
        int a = 1;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1000000007;
            a = b;
            b = result;
        }
        return result;


//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        int result = numWays(n - 1) + numWays(n - 2);
//        if (result > 1000000007) {
//            result = result % 1000000007;
//        }
//        return result;
    }
}
