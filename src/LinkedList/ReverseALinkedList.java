package LinkedList;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        ListNode front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // 1 -> 2 -> 3 -> 4 -> 5
    // 1 <- 2 <- 3 <- 4 <- 5
    public ListNode reverseListUsingRecursion (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListUsingRecursion(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
}
