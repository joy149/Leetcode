import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/sort-colors/description/
public class SortArraysOf012 {

    //TODO: To find better solution than this
    public void sortColors(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i])+1);
            }
            else {
                countMap.put(nums[i], 1);
            }
        }
        Arrays.fill(nums, -1);
        int noOfZeroes = Optional.ofNullable(countMap.get(0)).isPresent() ? countMap.get(0) : 0;
        int noOfTwos = Optional.ofNullable(countMap.get(2)).isPresent() ? countMap.get(2) : 0;

        for (int i = 0; i < noOfZeroes; i++) {
            nums[i] = 0;
        }
        for (int i = nums.length -1; i >= nums.length-noOfTwos; i--) {
            nums[i] = 2;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]== -1) {
                nums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        (new SortArraysOf012()).sortColors(new int[]{1,2});
    }
}
