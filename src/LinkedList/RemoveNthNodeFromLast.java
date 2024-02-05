package LinkedList;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNodeFromLast {
    /*
        To enhance efficiency, we will involve two pointers, a fast pointer and a slow pointer.
        The fast-moving pointer will initially be exactly N nodes ahead of the slow-moving pointer.
        After which, both of them will move one step at a time.
        When the fast pointer reaches the last node, i.e., the L-th node,
        the slow is guaranteed to be at the (L-N)-th node,
        where L is the total length of the linked list.
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next.next;
        temp.next = null;
        return head;
    }
}
