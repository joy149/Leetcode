package BST;

import java.util.*;

public class BuildBst {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10,8,21,6,7,3,5,1);
        Node node = null;
        for (Integer i : input) {
            node = buildBinarySearchTree(node , i);
        }
        inorderTraversal(node);
        System.out.println("-------------");
        levelOrderTraversal(node);
    }

    private static Node buildBinarySearchTree(Node node, Integer data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data) {
            node.left = buildBinarySearchTree(node.left, data);
        }
        else if (data > node.data) {
            node.right = buildBinarySearchTree(node.right, data);
        }
        return node;
    }

    //ascending traversal of Tree starting from left
    private static void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);
    }

    //Level by level traversal of Tree
    private static void levelOrderTraversal(Node node) {
        //Iterative approach using queue
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.println(n.data);
            if (n.left != null) queue.offer(n.left);
            if (n.right != null) queue.offer(n.right);
        }
    }
}
