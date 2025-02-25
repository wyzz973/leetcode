package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    // 递归
    // 步骤：递归调用左子树，再访问根节点，递归调用右子树
    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node != null){
                if (node.right != null){
                    stack.push(node.right);
                }
                stack.push(node);
                stack.push(null);
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
        inorderTraversal_94 solution = new inorderTraversal_94();
        List<Integer> result = solution.inorderTraversal2(root);
        System.out.println(result);
    }

}
