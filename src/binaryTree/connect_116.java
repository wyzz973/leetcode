package binaryTree;

/**
 * @author sd
 * @date 2025/2/27 19:11
 * @description: 116.填充每个节点的下一个右侧节点指针
 */

import java.util.LinkedList;
import java.util.Queue;


// Definition for a Node.


public class connect_116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if (root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                Node node = queue.poll();
                if (size == 1){
                    node.next = null;
                }else {
                    node.next = queue.peek();
                }
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
