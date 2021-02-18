package com.rita.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class Reverse {
    public int reverse(int x) {

        boolean flag = false;

        if (x < 0) {
            x = x * (-1);
            flag = true;
        }

        StringBuffer result = new StringBuffer();

        while ((x / 10) != 0) {
            result.append(x % 10);
            x = x / 10;
        }

        if (x != 0) {
            result.append(x);

        }

        int i;

        try {
            i = Integer.parseInt(result.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        if (flag) {
            i = i * (-1);
        }

        return i;
    }
}
