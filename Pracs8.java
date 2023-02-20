package edu.DS_practicals;
/*class TreeNode {
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
}*/

public class Pracs8 {
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
    public static TreeNode delete(TreeNode root, int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else {//root.data==val
            //case 1
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3
            TreeNode IS = inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    } 
    
    public static TreeNode inorderSuccessor(TreeNode root){
        while(root.left!= null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        Pracs8 tree = new Pracs8();

        int[] inputs = {8,5,3,1,4,6,10,11,14};
        //create a tree
        for (int i:inputs) {
            root = tree.insert(root, i);
        }
        inorder(root);
        // if(search(root,9)){
        //     System.out.println("\nfound");
        // }else{
        //     System.out.println("\nnot found");
        // }
        // preorder(root);

        System.out.print("\nSum of elements >=3 is ");
        //Find the sum of elements greater or equal to specified element
        System.out.println(sumof(root,3));

        inorder(root);
        System.out.println("\nAfter Deletion");
        delete(root,4);
        inorder(root);
    }
}
