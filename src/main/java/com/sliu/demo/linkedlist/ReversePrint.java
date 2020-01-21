package com.sliu.demo.linkedlist;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author: sliu
 * @date: 2020/1/21 16:07
 **/
public class ReversePrint {
    /**
     *输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> reversePrint(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList();
        if (listNode == null) {
            System.out.println("null");
            return arrayList;
        }
        Vector<Integer> vector = new Vector();
        vector.add(listNode.value);
        while (listNode.next != null) {
            listNode = listNode.next;
            vector.add(listNode.value);
        }
        for (Integer integer : vector) {
            arrayList.add(integer);
        }
        return arrayList;
    }

    /**
     * 递归实现
     * @param listNode
     * @return
     */
    ArrayList arrayList1 = new ArrayList();

    public ArrayList reversePrintRecursion(ListNode listNode) {
        if (listNode == null) {
            return arrayList1;
        }
        reversePrintRecursion(listNode.next);
        arrayList1.add(listNode.value);
        return arrayList1;

    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        node1.value = 1;
        node2.value = 2;
        node3.value = 3;
        node4.value = 4;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        ArrayList<Integer> integers = reversePrint(node3);
        ArrayList integers = new ReversePrint().reversePrintRecursion(node1);
        System.out.println(integers);
    }

}
