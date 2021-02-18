package com.rita.leetcode;

import com.rita.leetcode.linked.common.ListNode;

/**
 * 反转一个单链表。
 *
 * @author yaoyuying
 * @version 1.0
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {

        int size = 0;
        for (ListNode x = head; x != null; x = x.next) {
            size++;
        }

        if (size <= 1) {
            return head;
        }

        ListNode node = head;

        ListNode nextNode = null;
        ListNode curNode = null;

        for (int x = 0; x < size; x++) {
            if (x == 0) {
                nextNode = new ListNode(node.val);

            } else {
                curNode = new ListNode(node.val);
                curNode.next = nextNode;
                nextNode = curNode;
            }
            node = node.next;
        }
        return curNode;
    }
}
