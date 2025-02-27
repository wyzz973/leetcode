package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class isSymmetric_101 {
    public boolean isSymmetric(TreeNode root) {

        return compare(root.left,root.right);
    }

//    public TreeNode invert(TreeNode root){
//        if (root == null){
//            return root;
//        }
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        invert(root.left);
//        invert(root.right);
//        return root;
//    }

    public boolean compare(TreeNode left, TreeNode right){
        if (left != null && right == null){
            return false;
        }else if (left == null && right != null){
            return false;
        }else if (left == null && right == null){
            return true;
        }else if (left.val != right.val){
            return false;
        }

        boolean outside = compare(left.left,right.right);
        boolean inside = compare(left.right,right.left);

        return outside && inside;
    }

}
