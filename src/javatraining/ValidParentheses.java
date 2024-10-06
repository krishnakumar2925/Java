package javatraining;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
        String input = "()";
        boolean result = isValid(input);
        System.out.println(result); // Expected Output: true
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        

        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket onto the stack when encountering an opening bracket
            if (c == '(') {
                stack.push(')');
                System.out.println(stack);
            } else if (c == '{') {
                stack.push('}');
                System.out.println(stack);
            } else if (c == '[') {
                stack.push(']');
                System.out.println(stack);
            } else {
                // If the stack is empty or the top doesn't match the closing bracket, return false
                if (stack.isEmpty() || stack.pop() != c) {
                	System.out.println(stack);
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}


