package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class isBalanced_110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int leftDeepth = deepth(root.left);
        int rightDeepth = deepth(root.right);

        return Math.abs(leftDeepth - rightDeepth) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);//还要判断左右子树是否平衡
    }
    public int deepth(TreeNode root){
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int deepth = 0;
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
            deepth++;
        }
        return deepth;
    }
}
