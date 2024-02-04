package Strings;

//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWords {

    //s = "the sky is blue"
    // out = "blue is sky the"
    public static String reverseWords(String s) {

        s=s.trim();

        StringBuilder sb = new StringBuilder();
        String [] str = s.split("\\s");
        for (int i = str.length-1; i>=0; i--) {
            if (str[i].length()==0)
                continue;
            sb.append(new StringBuffer(str[i]).append(" ").toString());

        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
