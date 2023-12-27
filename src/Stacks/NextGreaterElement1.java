package Stacks;

import java.util.*;

//https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElement1 {
    //[3,10,4,2,1,2,6,1,7,2,9]
    //[10,-1,6,0,2,6,7,7,9,9,-1]
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = getIndexMapping(nums1, nums2);
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length -1; i >= 0; i--) {
                int res = 0;
                while (!st.isEmpty() && st.peek() <= nums2[i]) {
                    st.pop();
                }
                if (st.isEmpty() || nums2[i] < st.peek()) {
                    if (!st.isEmpty()) {
                        res = st.peek();
                    } else res = -1;
                    st.push(nums2[i]);
                    if (map.containsKey(nums2[i])) {
                        nums1[map.get(nums2[i])] = res;
                    }
                }
            }
        return nums1;
    }

    private Map<Integer, Integer> getIndexMapping(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString((new NextGreaterElement1()).nextGreaterElement(new int[]{2,4}, new int[] {1,2,3,4})));
    }
}
