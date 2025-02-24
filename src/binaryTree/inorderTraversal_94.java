package binaryTree;

import java.util.ArrayList;
import java.util.List;

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

    //测试用例
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        inorderTraversal_94 solution = new inorderTraversal_94();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }

}
