package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        List<Integer> val = new ArrayList<>();
        path(root,ans,val);
        return ans;
    }
    public void path(TreeNode root, List<String> ans, List<Integer> val){
        val.add(root.val);

        if (root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
//            val.forEach(num -> sb.append(num).append("->"));
//            sb.setLength(sb.length() - 2);
            for (int i = 0; i < val.size() - 1; i++) {
                sb.append(val.get(i)).append("->");
            }
            sb.append(val.getLast());
            ans.add(sb.toString());
            return;
        }

        if (root.left != null){
            path(root.left,ans,val);
//            val.remove(val.getLast());
            val.removeLast();
        }

        if (root.right != null){
            path(root.right,ans,val);
//            val.remove(val.getLast());
            val.removeLast();
        }

    }
}
