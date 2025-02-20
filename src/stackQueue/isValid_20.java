package stackQueue;

import java.util.*;

/**
 * @author sd
 * @date 2025/2/20 20:02
 * @description: 20.有效的括号
 */
public class isValid_20 {
    public static boolean isValid(String s) {
//        Deque<Character> deque = new LinkedList<>();

        Stack<Character> stack = new Stack<>();
       /*
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }

        */
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(')');
            }else if (s.charAt(i) == '{'){
                stack.push('}');
            }
            else if (s.charAt(i) == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.peek() != s.charAt(i)){
                return false;
            }else {
                stack.pop();
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

}
