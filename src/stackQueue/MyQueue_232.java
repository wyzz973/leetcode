package stackQueue;

import java.util.Stack;

/**
 * @author sd
 * @date 2025/2/19 21:06
 * @description: 232.用栈实现队列
 */
public class MyQueue_232 {
    class MyQueue {
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;
        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        public int pop() {
            for (int i = 0; i < stackIn.size();) {
                stackOut.push(stackIn.pop());
            }
            return stackOut.pop();
        }

        public int peek() {
            for (int i = 0; i < stackIn.size();) {
                stackOut.push(stackIn.pop());
            }
            return stackOut.peek();
        }

        public boolean empty() {
            return stackOut.isEmpty() && stackIn.isEmpty();
        }
    }
}
