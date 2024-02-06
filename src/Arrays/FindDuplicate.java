package Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/description/
//Optimal solution pending.
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int[] freq = new int [nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq[nums[i]] == 0) {
                freq[nums[i]] += 1;
            } else {
                res= nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2}));
    }
}
