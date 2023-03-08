/*
 * Author: Jenis Winsta
 * Date:01/02/2023
 * Description: class TreeNode is used to create Nodes of tree data structure.
 *  insert(TreeNode) is used to insert values inside the tree and we write 
 * individual functions to find Inorder, preorder and postorder sequence. 


 */

package edu.DS_practicals;

// import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TreeDemo {

    // TreeNode node = null;
    // TreeNode root = null;
    // TreeNode p = root;
    // TreeNode q = root;

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data <= root.getData()) {
            root.setLeft(insert(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft());
        System.out.print(node.getData() + " ");
        inorder(node.getRight());
    }

    void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    void postorder(TreeNode node) {
        if (node == null) {
            return;
        }
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public static void main(String[] args) {
        TreeNode root = null;
        TreeDemo tree = new TreeDemo();

        int[] inputs = { 1, 5, 3, 8, 7, 6, 9, 15, 14, 51, 84, 17 };
        // create a tree
        for (int i : inputs) {
            root = tree.insert(root, i);
        }
        // System.out.println(root.data);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter no. of inputs");
        // int n = sc.nextInt();

        // create tree
        // for (int i = 0; i < 12; i++) {
        // // System.out.println("Enter value ");
        // // int tmp_val = sc.nextInt();
        // int tmp_val=inputs[i];
        // root = tree.insert(root, tmp_val);
        // }

        // root = tree.insert(root, 50);
        // root = tree.insert(root, 30);
        // root = tree.insert(root, 90);
        // root = tree.insert(root, 20);
        // root = tree.insert(root, 40);
        System.out.println();
        System.out.println("Inorder: ");
        tree.inorder(root);
        System.out.println("\nPreorder: ");
        tree.preorder(root);
        System.out.println("\nPostorder: ");
        tree.postorder(root);

    }

}
