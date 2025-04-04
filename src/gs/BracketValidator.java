package gs;

import java.util.Stack;

public class BracketValidator {


    public static void main(String[] args) {
        System.out.println(bracketValidator("][]()"));
    }

    private static boolean bracketValidator(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = true;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else {
                char it = st.isEmpty() ? 'a': st.peek();
                char c = s.charAt(i);
                if ((it == '(' && c == ')') || (it == '[' && c == ']') || (it == '{' && c == '}')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return flag;
    }
}
