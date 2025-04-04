package gs;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] result = productExceptSelf(new int [] {-1,1,0,-3,3});
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;

        //calculate prefix product
        for (int i = 1; i < n ; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        //calculate suffix product
        for (int i = n-2; i>=0; i--) {
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
