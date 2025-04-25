package gs;

import java.util.Arrays;

public class MergeSortedArray {
    /*
    * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
      Output: [1,2,2,3,5,6]
      Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
      The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    * */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];

            } else {
                nums1[k--] = nums2[j--];
            }
        }

    }

    public static void main(String[] args) {
        int [] nums1 = new int[] {0};
        int [] nums2 = new int[] {1};
        int m = 0, n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
