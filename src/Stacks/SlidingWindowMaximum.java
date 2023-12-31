package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    //Lets try brute force!
    /*
    * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    * Output: [3,3,5,5,6,7]
    * */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] resArr = new int[nums.length-k+1];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < resArr.length; i++) {
            max = nums[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(nums[j], max);
            }
            resArr[i] = max;
        }
        return resArr;
    }

    //Here we are gonna use deque and maintain a decreasing order of elements.
    //At each iteration check out-of-bounds elements and remove them from top.
    //Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    public int[] maxSlidingWindowOptimized(int[] nums, int k) {
        int n = nums.length;
        int[] resArr = new int[n-k+1];
        int ri = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            //removing out of bounds elements
            if (!dq.isEmpty() && dq.peek() == i-k) {
                dq.poll();
            }
            //removing elements which are smaller than nums[i] from back, to maintain decreasing order
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            // finding max now for each subarrays
            if (i >= k-1) {
                resArr[ri++] = nums[dq.peek()];
            }
        }
        return resArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString((new SlidingWindowMaximum()).maxSlidingWindowOptimized(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
    }
}
