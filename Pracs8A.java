/*
 * Practical  8A: A. Search for the num 9 in the data from tree

 */
package edu.DS_practicals;

public class Pracs8A {
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
    static void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeft());
        System.out.print(node.getData()+" "); 
        inorder(node.getRight());
    }
    public static boolean search(TreeNode root, int key){
        if(root ==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args) {
        TreeNode root = null;
        Pracs8A tree = new Pracs8A();

        int[] inputs = {8,5,3,1,4,6,10,11,14};
        //create a tree
        for (int i:inputs) {
            root = tree.insert(root, i);
        }
        System.out.println();
        //Printing the tree
        inorder(root);

        //Searching '9'
        int num=3;
        if(search(root,num)){
            System.out.println("\n"+num+" Found\n");
        }else{
            System.out.println("\n"+num+" Not found\n");
        }
    }
}
