package BST;

import java.util.ArrayDeque;
import java.util.Queue;

public class SearchBST {
    public Node searchBST(Node root, int val) {
        if (root == null || root.data == val)
            return root;
        return val < root.data ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
