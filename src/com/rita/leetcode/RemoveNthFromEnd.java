package com.rita.leetcode;

import leetcode.common.ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 *
 * @author yaoyuying
 * @date 2021/02/02
 * @since 1.0
 */
public class RemoveNthFromEnd {

    public ListNode solution(ListNode head, int n) {

      /* 方法一： 栈存储链表节点，利用栈 “先进后出” 的工作原理，出栈n个节点，恰好是要删除的倒数第 n 个结点。

        ListNode newList = new ListNode(0, head);

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = newList;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        for (int i = 0; i < n; i++) {
            stack.pop();
        }

        ListNode node = stack.peek();
        node.next = node.next.next;

        return newList.next;*/

        // 方案二：利用双节点，即快慢节点，两节点之间恰好间隔n个节点，当快节点到达链表末尾时，
        // 恰好慢节点在倒数第 n 个结点的前驱节点
        ListNode listNode = new ListNode(0, head);
        ListNode first = head;
        ListNode second = listNode;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next=second.next.next;
        return listNode.next;
    }
}
