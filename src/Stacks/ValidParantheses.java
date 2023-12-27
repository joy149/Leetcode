package Stacks;

import java.util.Stack;


//https://leetcode.com/problems/valid-parentheses/
public class ValidParantheses {
    //"({[]})"
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ((c == '(') || (c == '{') || (c == '['))
                stack.push(c);
            else {
                char it = stack.isEmpty() ? 'a' : stack.peek();
                if ((it =='(' && c == ')') || (it =='{' && c == '}') || (it =='[' && c == ']')) {
                    stack.pop();
                }
                else return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println((new ValidParantheses()).isValid("]"));
    }
}
