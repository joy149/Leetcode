package Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsPerLength {

    public static List<String> sortListOfStrings (List<String> strings) {
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return 1;
                return -1;
            }
        };
        strings.sort(com);
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Joy", "is", "aa", "developer");
        List<String> sortedStrings = sortListOfStrings(strings);
        sortedStrings.forEach(System.out::println);
    }
}
