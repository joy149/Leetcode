package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        //Creating a min heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);

            //Maintaining min heap size of k
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println((new KthLargestElement()).findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
