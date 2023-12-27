package Arrays;

//https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarray {
    // nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Intuition is to discard any subarray whose sum is negative as it is going to reduce the max sum value
    public int maxSubArray(int[] nums) {
        int sum = 0;
        //int i = 0,j= nums.length-1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println((new MaximumSubarray()).maxSubArray(new int[] {-1, -2}));
    }
}
