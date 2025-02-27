package binaryTree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author sd
 * @date 2025/2/27 14:19
 * @description: 104.二叉树的最大深度
 */
public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root == null){
            return max;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            max++;
        }

        return max;
    }
}
