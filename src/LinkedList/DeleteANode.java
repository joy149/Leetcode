package LinkedList;

//https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class DeleteANode {
    public void deleteNode(ListNode node) {
        ListNode delNode = node.next;
        node.val = node.next.val;
        node.next = delNode.next;
        delNode = null;
    }
}
