package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricalTrees {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
//        else if (root.left.val != root.right.val) return false;

        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        else if (p==null || q==null) return false;
        return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    public static boolean isSymmetricIterative(TreeNode node) {

        if (node == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node.left);
        queue.add(node.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) continue;
            else if (left == null || right == null) return false;
            else if (left.val != right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
