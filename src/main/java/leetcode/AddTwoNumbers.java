package leetcode;

import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 */


public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4, listNode1);
        ListNode listNode3 = new ListNode(2, listNode2);

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(6, listNode4);
        ListNode listNode6 = new ListNode(5, listNode5);

        System.out.print(addTwoNumbers(listNode3, listNode6));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var sumNodes1 = getSumNodes(l1);
        var sumNodes2 = getSumNodes(l2);

        var result = new BigInteger(sumNodes1).add(new BigInteger(sumNodes2));

        return getResultList(String.valueOf(result));
    }

    private static String getSumNodes(ListNode listNode) {
        if (listNode.next == null) {
            return String.valueOf(listNode.val);
        }

        var val = String.valueOf(listNode.val);
        return getSumNodes(listNode.next) + val;
    }

    private static ListNode getResultList(String string) {
        ListNode resultList = null;

        for (int i = 0; i < string.length(); i++) {
            if (resultList == null) {
                resultList = new ListNode(Character.getNumericValue(string.charAt(i)));
            } else {
                resultList = new ListNode(Character.getNumericValue(string.charAt(i)), resultList);
            }
        }

        return resultList;
    }
}
