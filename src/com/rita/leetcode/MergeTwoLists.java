package com.rita.leetcode;

import com.rita.leetcode.linked.common.ListNode;

/**
 * 合并两个有序链表
 *
 * @author yaoyuying
 * @version 1.0
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);

        ListNode preNode = node;
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                preNode.next = l1;
                l1 = l1.next;
            } else {
                preNode.next = l2;
                l2 = l2.next;
            }
            preNode = preNode.next;
        }

        preNode.next = (l1 == null ? l2 : l1);
        return node.next;
    }
}
