package LinkedList;


//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {

    /*In the Tortoise-Hare approach, we increment slow ptr by 1 and fast ptr by 2,
    so if take a close look fast ptr will travel double that of the slow pointer.
    So when the fast ptr will be at the end of the Linked List,
    slow ptr would have covered half of the Linked List till then.
    So slow ptr will be pointing towards the middle of Linked List.
    */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
