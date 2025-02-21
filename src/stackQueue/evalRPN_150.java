package stackQueue;

import java.util.Stack;

/**
 * @author sd
 * @date 2025/2/20 20:59
 * @description: 150.逆波兰表达式
 */
public class evalRPN_150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("*") && !tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/")) {
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            } else if (tokens[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);

            } else if (tokens[i].equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if (tokens[i].equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 * num1);
            } else if (tokens[i].equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(strings));
    }
}
