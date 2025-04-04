package BST;

public class InsertIntoBST {
    public Node insertIntoBST(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);
        return root;
    }
}
