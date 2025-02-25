package binaryTree;

import java.util.*;

public class levelOrderBottom_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while(size-- > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }

        // result = result.reverse();
        Collections.reverse(result);
        return result;

    }
}
