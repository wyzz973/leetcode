package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collector;

/**
 * @author sd
 * @date 2025/2/20 20:37
 * @description: 1047.删除字符中的所有相邻重复项
 */
public class removeDuplicates_1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> queue = new Stack<>();
        for(char c : s.toCharArray()){
            if (!queue.isEmpty() && queue.peek().equals(c)){
                queue.pop();
//                queue.pop();
                continue;
            }
            queue.push(c);
        }
        // 使用StringBuilder拼接队列中的字符
        StringBuilder sb = new StringBuilder();
        for (char c : queue) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }
}
