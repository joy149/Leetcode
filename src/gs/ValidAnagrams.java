package gs;

import java.util.*;

public class ValidAnagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(groupAnagramsOptimized(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> charMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!charMap.containsKey(ch))
                return false;
            charMap.put(ch, charMap.get(ch)-1);
            if (charMap.get(ch) == 0)
                charMap.remove(ch);
        }
        return charMap.isEmpty();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedWords = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            groupedWords.putIfAbsent(key, new ArrayList<>());
            groupedWords.get(key).add(s);

        }
        return groupedWords.values().stream().toList();
    }

    public static List<List<String>> groupAnagramsOptimized(String[] strs) {

        Map<String, List<String>> groupedWords = new HashMap<>();
        for (String s : strs) {
            int[] freqMap = new int[26];
            for (char c : s.toCharArray()) {
                freqMap[c - 'a']++;
            }
            String key = Arrays.toString(freqMap);
            groupedWords.putIfAbsent(key, new ArrayList<>());
            groupedWords.get(key).add(s);

        }
        return groupedWords.values().stream().toList();

    }
}
