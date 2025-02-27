package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageOfLevels_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Long sum = 0L;
            int len = size;
            while (size-- > 0){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            double avg = (double) sum / len;
            result.add(avg);
        }
        return result;
    }
}
