package gs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
* Given arrays of string, filter out non-empty and null strings
*/
public class FilterEmptyString {

    public static List<String> filterEmptyString (String[] arr) {
        return Arrays.stream(arr)
                .filter(ele -> Objects.nonNull(ele) && !ele.isEmpty())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"test", "", "Test1", null, "test2"};
        List<String> result = filterEmptyString(arr);
        System.out.println(result);
    }
}
