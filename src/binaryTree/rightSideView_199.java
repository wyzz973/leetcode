package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class rightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return result;
        }
        queue.offer(root);
        int size = queue.size();
        while(!queue.isEmpty()){
            while (size-- > 0){
                TreeNode node = queue.poll();
                if (size == 1){
                    result.add(node.val);
                }
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }

            }
        }

        return result;
    }
}
