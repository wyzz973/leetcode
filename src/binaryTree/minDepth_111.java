package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sd
 * @date 2025/2/27 18:41
 * @description: 111.二叉树的最小深度
 */
public class minDepth_111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int deep = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            deep++;
            while (size-- > 0){
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null){
                    return deep;
                }
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return deep;
    }

}
