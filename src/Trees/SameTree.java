package Trees;

public class SameTree {

    public static boolean isSameTree (TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        else if (p==null || q==null) return false;
        else if (p.val == q.val) {

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        p.left = new TreeNode(2);
        q.left = new TreeNode(2);
        p.right = new TreeNode(3);
        q.right = new TreeNode(3);
        System.out.println("Nodes are: " + isSameTree(p,q));

    }
}
