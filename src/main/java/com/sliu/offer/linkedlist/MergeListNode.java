package com.sliu.offer.linkedlist;

public class MergeListNode {
    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode re = null;
        if (list1.val <= list2.val) {
            re = list1;
            re.next = merge(list1.next, list2);
        } else {
            re = list2;
            re.next = merge(list1, list2.next);
        }
        return re;

    }

    public static ListNode merge1(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        ListNode last = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (head == null) {
                    head = last = list1;
                } else {
                    last.next = list1;
                    last = last.next;
                }
                list1 = list1.next;
            } else {
                if (head == null) {
                    head = last = list2;
                } else {
                    last.next = list2;
                    last = last.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            last.next = list2;
        }
        if (list2 == null) {
            last.next = list1;
        }
        return head;
    }

}
