package Tree_DSA;

import TreeNode;

class TreeNode{
    int data;
    Node left;
    Node right;

    TreeNode(){}

    TreeNode(int data){
        this.data = data;
    }
}

class Basictree{
    TreeNode root;
    TreeNode current;

    void setRoot(int num){
        root.data = num;
        current = root;
    }

    void insert(int num){
        TreeNode newNode = new TreeNode(num);
        
    }
}

public class Basic_Tree {
    public static void main(String[] args) {
        int [] input = new int[]{1,2,3,4,5,6,7};

        Basictree tree = new Basictree();

        tree.setRoot(input[0]);

        for(int i=1 ; i<input.length ; i++){
            tree.insert(input[i]);
        }
    }
}