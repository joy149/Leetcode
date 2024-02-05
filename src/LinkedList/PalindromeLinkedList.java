package LinkedList;

import java.util.Stack;

//https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    //Brute force way : Here we load a stack (LIFO) first with linkedlist values
    // And unload stack iteratively to check if the values are equal to original linkedlist
    // If yes, it is palindrome or else not.
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while (temp!=null) {
            st.push(temp.val);
            temp = temp.next;
        }
        boolean flag = true;
        while(!st.isEmpty()) {
            if (head.val != st.pop()) {
                flag = false;
            }
            head = head.next;
        }
        return flag;
    }
}
