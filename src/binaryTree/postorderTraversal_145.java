package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postoder(root,list);
        return list;
    }
    // 后序遍历
    // 递归
    //步骤：递归调用左子树，递归调用右子树，再访问根节点
    public void postoder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postoder(root.left, list);
        postoder(root.right, list);
        list.add(root.val);
    }

//    后序遍历顺序：左子树、右子树、根节点
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node != null){
                stack.push(node);
                stack.push(null);
                if (node.right != null){
                    stack.push(node.right);
                }
                if (node.left != null){
                    stack.push(node.left);
                }
            }else {
                node = stack.pop();
                list.add(node.val);
            }
        }
        return list;
    }

    //测试用例
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        postorderTraversal_145 solution = new postorderTraversal_145();
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println(result);
    }
}
