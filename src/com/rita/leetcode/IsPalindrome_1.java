package com.rita.leetcode;

import com.rita.leetcode.linked.common.ListNode;

import java.util.ArrayList;

/**
 * 请判断一个链表是否为回文链表。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class IsPalindrome_1 {
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        int size = 0;
        for (ListNode x = head; x != null; x = x.next) {
            size++;
        }

        ListNode x = head;
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                list.add(x.val);
            }

            if ((i > size / 2) || ((i == size / 2) && (size % 2 == 0))) {
                if (x.val == list.get(list.size() - 1)) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }

            x = x.next;
        }
        return true;
    }
}
