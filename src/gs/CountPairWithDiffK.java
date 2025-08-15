package gs;

import java.util.HashMap;
import java.util.Map;

//http://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
public class CountPairWithDiffK {

    public static int countPair(int [] nums, int k) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        int countPair = 0;
        for (int i = 0; i < nums.length; i++) {
            if (diffMap.containsKey(nums[i] - k)){
                countPair += diffMap.get(nums[i] - k);
            }
            if (diffMap.containsKey(nums[i] + k)) {
                countPair += diffMap.get(nums[i] + k);
            }
            diffMap.put(nums[i], diffMap.getOrDefault(nums[i], 0)+1);
        }
        return countPair;
    }
}
