package com.sliu.offer.linkedlist;

import java.util.Stack;

/**
 * 反转链表
 */
public class ReverseList {

    public static ListNode ReverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }

}
