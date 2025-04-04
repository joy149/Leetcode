package gs;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FirstDuplicateLetter {

    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(firstDuplicateLetter("auefni")).isEmpty()? "Not found" : firstDuplicateLetter("auefni"));
    }

    private static Character firstDuplicateLetter(String s) {
        Set<Character> hashSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (hashSet.contains(c)) {
                return c;
            }
            hashSet.add(c);
        }
        return null;
    }
}
