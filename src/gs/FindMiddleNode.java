package gs;

import LinkedList.ListNode;

public class FindMiddleNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        ListNode node1 = new ListNode(4, node);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(1, node3);
        ListNode temp = node4;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        ListNode middleNode = findMiddleNode(node4);
        System.out.println(middleNode.val);
    }

    private static ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
