package gs;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23
public class CountLargestGroup {
    public static void main(String[] args) {
        System.out.println("Largest group: " + countLargestGroup(345));
    }

    private static int countLargestGroup(int n) {
        Map<Integer, List<Integer>> sumToGroupMap = new HashMap<>();
        for (int i=1; i<=n; i++) {
            int sumOfDigits = getSumOfDigits(i);
            sumToGroupMap.computeIfAbsent(sumOfDigits, k->new ArrayList<>()).add(i);
        }
        int maxCount = 0;
        long count = sumToGroupMap.values().stream().map(List::size).sorted(Comparator.reverseOrder()).toList().getFirst();
        for (List<Integer> list : sumToGroupMap.values()) {
            if (list.size() == count) {
                maxCount++;
            }
        }
        return maxCount;
    }

    private static int getSumOfDigits(int i) {
        int sum = 0;
        while (i>0) {
            sum += i % 10;
            i = i/10;
        }
        return sum;
    }
}
