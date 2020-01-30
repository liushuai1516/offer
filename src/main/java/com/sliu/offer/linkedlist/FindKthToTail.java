package com.sliu.offer.linkedlist;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public static ListNode FindKthToTail1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode result = null;
        if (stack.size() < k) {
            return null;
        }
        for (int j = 0; j < k; j++) {
            result = stack.pop();
        }
        return result;
    }

    /**
     * 两个指针，一个先走k
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail2(ListNode head, int k) {
        if (head==null) {
            return null;
        }
        ListNode pre = head;
        ListNode pos = head;
        for (int i = 0; i < k; i++) {
            if (pre != null){
                pre = pre.next;
            }else {
                return null;
            }
        }
        while (pre !=null){
            pre = pre.next;
            pos = pos.next;
        }
        return pos;


    }

}
