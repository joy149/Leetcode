package Strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/
public class LargestSubstring {
    //abcadeeeeed
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                int start = charMap.get(c);
                max = Math.max(i-start-1, max);
            } else {
                charMap.put(c, i);
            }
        }
        return max >= 0 ? max : -1;
    }

    public static void main(String[] args) {
        System.out.println((new LargestSubstring()).maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }
}
