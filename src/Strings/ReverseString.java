package Strings;

//Reverse a string without using any in-built functionality
public class ReverseString {
    public static void main(String[] args) {
        String s = "Joy";
        System.out.println(reverseString(s));

    }

    private static String reverseString(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] charArray = s.toCharArray();
        while (i < j) {
            char temp = charArray[i];
            charArray[i++] = charArray[j];
            charArray[j--] = temp;
        }
        return new String(charArray);
    }
}
