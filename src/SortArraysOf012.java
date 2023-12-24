import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/sort-colors/description/
public class SortArraysOf012 {

    //TODO: To find better solution than this

    //This solution has a time complexity of O(2N)
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

    //Dutch National Flag Algo
    /*
    Follow the link for detailed explanation
    https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/

    if arr[mid] is 0 swap arr[low] and arr[mid] and do mid++ , low++
    if arr[mid] is 1 do mid++
    if arr[mid] is 2 swap arr[mid] with arr[high] and high--
     */
    public void sortColorsOptimized(int[] arr) {

        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high){
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        (new SortArraysOf012()).sortColorsOptimized(new int[]{2,0,2,1,1,0});
    }
}
