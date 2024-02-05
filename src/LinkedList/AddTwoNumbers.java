package LinkedList;

import java.awt.*;

//https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {

    /*
      Input: l1 = [2,4,3], l2 = [5,6,4]
      Output: [7,0,8]
      Explanation: 342 + 465 = 807.
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode res = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node  = new ListNode( sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return res.next;
    }
}
