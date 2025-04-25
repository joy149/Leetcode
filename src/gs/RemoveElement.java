package gs;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = new int[] {3,2,2,3};
        int k = removeElement(nums, 3);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

    private static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length -1;
        int k = 0;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == val) {
                k++;
            }
        }
        while (i <= j) {
            int temp = 0;
            if (nums[j] == val) {
                j--;
                continue;
            }
            else if (nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j--] = temp;
            }
            i++;
        }
        return k;
    }
}
