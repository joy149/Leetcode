package gs;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(checkPalindrome(121));
    }

    private static boolean checkPalindrome(int i) {
        int reversed = 0;
        int num = i;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return i == reversed;
    }
}
