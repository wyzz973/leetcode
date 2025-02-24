package binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


public class preorderTraversal_144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
//        preoder(root,list);
        Stack<TreeNode> stack= new Stack<>();

        if (root==null){
            return list;
        }
        //解释：根节点入栈，然后弹出根节点，将根节点的值加入到list中，
        // 然后判断根节点的右子树是否为空，如果不为空，则将右子树入栈，
        // 然后判断根节点的左子树是否为空，如果不为空，则将左子树入栈，
        // 重复此过程，直到栈为空。
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }


        return list;
    }
    //递归前序遍历：
    //步骤：1.判断是否为空，为空直接返回；2.将根节点的值加入到list中；3.递归遍历左子树；4.递归遍历右子树。
    public void preoder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preoder(root.left, list);
        preoder(root.right, list);
    }



    //测试用例
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        preorderTraversal_144 solution = new preorderTraversal_144();
        List<Integer> result = solution.preorderTraversal(root);

        System.out.println(result); // 输出结果：[1, 2, 3]
    }

}
