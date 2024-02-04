package LinkedList;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    //Input: list1 = [1,2,4], list2 = [0,3,4]
    //Output: [1,1,2,3,4,4]
    // We are gonna do it in O(1) space complexity
    //Step1: Point L1 to smallest element.
    //Step2: loop over l1 until it is smaller than l2
    //Step3: now point tmp.next to l2 since its smaller now
    //Step4: swap l1 and l2 to repeat the same process.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //Step1
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode res = l1;
        while (l1 != null && l2 != null) {
            ListNode tmp = null;
            while (l1 != null && l1.val <= l2.val) {
                tmp = l1;
                l1 = l1.next;
            }
            //step3
            tmp.next = l2;
            //step4
            ListNode swp = l1;
            l1 = l2;
            l2 = swp;
        }
        return res;
    }
}
