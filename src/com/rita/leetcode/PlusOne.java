package com.rita.leetcode;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        return haveNeedToCarry(digits, digits.length - 1);
    }

    public int[] haveNeedToCarry(int[] digits, int index) {
        if (9 != digits[index]) {
            digits[index]++;
        } else {
            if (index == 0) {
                int[] array = new int[digits.length + 1];
                array[0] = 1;
                return array;
            }
            digits[index] = 0;
            digits = haveNeedToCarry(digits, --index);
        }
        return digits;
    }

}
