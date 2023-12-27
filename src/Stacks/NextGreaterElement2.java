package Stacks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 2*n-1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i%n]) {
                st.pop();
            }
            if (st.isEmpty() || nums[i%n] < st.peek()) {
                if (!st.isEmpty()) {
                    res[i%n] = st.peek();
                } else res[i%n] = -1;
                st.push(nums[i%n]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString((new NextGreaterElement2()).nextGreaterElements(new int[] {1,2,3,4,3})));
    }
}
