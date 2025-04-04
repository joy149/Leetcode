package gs;

import java.util.Arrays;
import java.util.Optional;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] result = reverseArray(arr);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] reverseArray(int[] arr) {
        if (arr == null) {
            return new int[]{};
        }
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }
        int i = 0;
        int j = arr.length - 1;
        while (i!=j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        return arr;
    }
}
