package com.rita.leetcode;

/**
 * LC 合并两个有序数组
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];

        System.arraycopy(nums1, 0, temp, 0, m);

        int p1 = 0;
        int p2 = 0;

        int p = 0;

        while (p1 < m && p2 < n) {
            nums1[p++] = temp[p1] > nums2[p2] ? nums2[p2++] : temp[p1++];
        }

        if (p1 < m) {
            System.arraycopy(temp, p1, nums1, p, m - p1);
        }

        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p, n - p2);
        }
    }
}
