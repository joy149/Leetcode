package gs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueFrequencies {
    public static void main(String[] args) {
        System.out.println(hasUniqueFrequencies(new int[]{2,1,2,3,3,3}));
    }

    private static boolean hasUniqueFrequencies(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(Integer i : countMap.values()) {
            if (set.contains(i)) {
                return false;
            }
            set.add(i);
        }
        return true;
    }
}
