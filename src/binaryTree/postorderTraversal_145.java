package binaryTree;

import java.util.ArrayList;
import java.util.List;

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
