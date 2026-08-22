package binaryTree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
    }
}

//        1
//       / \
//      2   3
//     /   / \
//    5   4   6
//       /
//      7
//       \
//        8

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // Add uneven children
        root.left.left = new Node(5);          // Left side deeper
        root.right.left = new Node(4);         // Right side child
        root.right.right = new Node(6);        // Another right child
        root.right.left.left = new Node(7);    // Extra depth
        root.right.left.left.right = new Node(8); // Uneven deeper node
//        DFS
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);

    }

//    ROOT_LEFT_RIGHT
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

//    LEFT_ROOT_RIGHT
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

//    LEFT_RIGHT_ROOT
    public static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

}