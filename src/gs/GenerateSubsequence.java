package gs;

import java.util.*;
import java.util.stream.Collectors;

public class GenerateSubsequence {

    public static void main(String[] args) {
        System.out.println(generateSubsequences("abcdefgh", 5));
        System.out.println(firstNonDuplicateCharacter("tpple"));
        System.out.println(mergeString("abc", "uvwxyz"));
    }

    private static List<String> generateSubsequences(String s, int k) {
        int left = 0;
        int right = k;
        int l = s.length();
        List<String> ans = new ArrayList<>();
        while (right <= l) {
            ans.add(s.substring(left, right));
            left++;
            right++;
        }
        return ans;
    }

    private static Character firstNonDuplicateCharacter(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1){
                return c;
            }
        }
        return null;
    }

    public static String mergeString (String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        List<Character> mergeResult = new ArrayList<>();
        int i = 0;

        while (i < s.length() && i< t.length()) {
            mergeResult.add(charArray[i]);
            mergeResult.add(charArray1[i]);
            i++;
        }
        if (i == s.length()) {
            for (int j = i; j < t.length(); j++) {
                mergeResult.add(charArray1[j]);
            }
        } else {
            for (int j = i; j < t.length(); j++) {
                mergeResult.add(charArray[j]);
            }
        }
        return mergeResult.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
