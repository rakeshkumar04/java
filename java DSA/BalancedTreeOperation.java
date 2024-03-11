import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BinTree {
    Node root;

    public void insert(int data){
        root = insertRec(root , data);
    }

    public Node insertRec(Node root , int data){
        if (root == null){
            root = new Node(data);
        }
        else{
            if (data < root.data){
                root.left = insertRec(root.left, data);
            }
            else{
                root.right= insertRec(root.right, data);
            }
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void preorder(){
        preorderRec(root);
    }

    public void postorder(){
        postorderRec(root);
    }

    public void inorderRec(Node root){
        if (root!=null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);

        }
    }

    public void preorderRec(Node root){
        if (root!=null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);

        }
    }

    public void postorderRec(Node root){
        if (root!=null){
            
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");

        }
    }

    int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        
        return Math.max(leftHeight,rightHeight)+1;
    }

    void isBalanced() {
        if (isBalanced(root)) {
            System.out.println("It is a Balanced Tree");
        } else {
            System.out.println("Not a Balanced tree");
        }
    }

    boolean isBalanced(Node node) {

        if (node == null) {
            return true;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        if (Math.abs(leftHeight - rightHeight) <= 1) {
            return true;
        }

        return false;
    }
}

public class BalancedTreeOperation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BinTree tree = new BinTree();

        System.out.println("Enter Number of Nodes: ");
        int n=scan.nextInt();

        for(int i=0 ; i<n ; i++){
            tree.insert(scan.nextInt());
        }
        
        tree.isBalanced();

        tree.preorder();

        scan.close();
    }
}
