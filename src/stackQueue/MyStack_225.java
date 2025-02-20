package stackQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sd
 * @date 2025/2/20 19:30
 * @description: 225.用队列实现栈
 */
public class MyStack_225 {
    class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue1.add(x);
        }

        public int pop() {
            while (queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            if (queue1.isEmpty()){
                return -1;
            }
            int ans =  queue1.poll();
            while (!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }

            return ans;
        }

        public int top() {
            while (queue1.size() > 1){
                queue2.add(queue1.poll());
            }
            if (queue1.isEmpty()){
                return -1;
            }
            int ans =  queue1.peek();
            queue2.add(queue1.poll());
            while (!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
            return ans;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
