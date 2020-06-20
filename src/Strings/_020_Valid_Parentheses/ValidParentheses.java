package Strings._020_Valid_Parentheses;

import java.util.Stack;

public class ValidParentheses {

    //"()[]{}"
    public static void main(String[] args) {
        ValidParentheses test = new ValidParentheses();
        test.isValid("]");
    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brackets.push(s.charAt(i));
            } else {
                if (brackets.isEmpty()) {
                    return false;
                }
                Character bracket = brackets.pop();
                if (s.charAt(i) == ')') {
                    if (bracket != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (bracket != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (bracket != '[') {
                        return false;
                    }
                }
            }
        }

        if (!brackets.isEmpty()) {
            return false;
        }
        return true;
    }
}



