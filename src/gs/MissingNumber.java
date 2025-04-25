package gs;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    // We are given that array contains n number and exactly one number is missing. Hence, we can apply the approach to calculate sum of n natural numbers (n*(n-1)/2) and subtract array running sum from it to find the missing number.
    /*
    n == nums.length
    1 <= n <= 104
    0 <= nums[i] <= n
    All the numbers of nums are unique.
    */
    private static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n+1))/2;
        int actualSum = 0;

        for (Integer i : nums) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
}
