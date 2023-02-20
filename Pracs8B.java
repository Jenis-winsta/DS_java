package edu.DS_practicals;

public class Pracs8B {
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
    public static int sumof(TreeNode root,int val){
        if(root==null){
            return 0;  
        }
        if(root.data>=val){
            return sumof(root.left, val)+sumof(root.right, val)+root.data;
        }
        
        else{
            return sumof(root.right, val);
        }
    }
    public static void main(String[] args) {
        TreeNode root = null;
        Pracs8B tree = new Pracs8B();

        int[] inputs = {8,5,3,1,4,6,10,11,14};
        //create a tree
        for (int i:inputs) {
            root = tree.insert(root, i);
        }
        System.out.println();
        inorder(root);
        System.out.print("\nSum of elements >=3 is ");
        //Find the sum of elements greater or equal to specified element
        System.out.println(sumof(root,3));
        System.out.println();
    }
}
