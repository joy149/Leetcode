package Java8Streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindOddAndEvenSum {
    public static int findOddSum (List<Integer> list) {
        return list
                .stream()
                .filter(a-> a%2 == 1)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static int findEvenSum (List<Integer> list) {
        return list.
                stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static Map<Integer, Long> findFreqOfEachElement(List<Integer> list) {
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        return collect;
    }

    public static int find3rdHighest(List<Integer> list) {
        Optional<Integer> first = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
        return first.orElse(-1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 1, 6, 5, 4, 2);
        System.out.println(findEvenSum(list));
        System.out.println(findOddSum(list));
        Map<Integer, Long> map = findFreqOfEachElement(list);
        System.out.println(map.toString());
        System.out.println(find3rdHighest(list));
    }
}
