package com.rita.leetcode;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * @author yaoyuying
 * @date 2021/01/29
 */
public class CQueue {

    Stack stack_1;
    Stack stack_2;

    public CQueue() {
        stack_1 = new Stack();
        stack_2 = new Stack();
    }

    public void appendTail(int value) {
        stack_1.push(value);
    }

    public int deleteHead() {
        if (stack_2.isEmpty()) {
            if (stack_1.isEmpty()) {
                return -1;
            } else {
                while (!stack_1.isEmpty()) {
                    stack_2.push(stack_1.pop());
                }
            }
        }
        return (int) stack_2.pop();
    }

}
