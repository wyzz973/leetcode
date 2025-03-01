package binaryTree;

public class countNodes_222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDeepth = 0;
        int rightDeepth = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        while (left != null){
            left = left.left;
            leftDeepth++;
        }

        while (right != null){
            right = right.right;
        }

        if (leftDeepth == rightDeepth){
            return (2 << leftDeepth) - 1;  // 2^leftDeepth - 1
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
