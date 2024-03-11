import java.util.*;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
    }
}

public class BinaryTree {
    
    Node root;
    int height =0;

    public void insert(int data){
        root = insertRec(root , data);
    }

    public void size(){
        System.out.println("Size: "+sizeRec(root));
    }

    public int[] toArray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root == null){
            return null;
        }
        
        
        return null;
    }

    public void levelOrderTraversal() {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }


    public int sizeRec(Node root){
        int count = 0;
        if(root == null){
            return 0;
        }
        count = 1 + sizeRec(root.left) + sizeRec(root.right);
        return count;
    }

    public void height(){
        int i=0;
        while(root.left!=null || root.right!=null)
        if (root == null){
            System.out.println("tree is empty");
        }
        else{
            if (root.left!=null){
                height++;
                root = root.left;
            }
            else{
                height++;
            }
            System.out.println("Height: "+height);
        }

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

    // public void inorderIteration(){
        
    //     Stack<Node> stack = new Stack<>();
    //     Node node = root;
    //     while(true){
    //         if (node!=null){
    //             stack.add(node);
    //             node = node.left;
    //         }
    //         else{
    //             if (stack.isEmpty()){
    //                 break;
    //             }
    //             Node temp = stack.pop();
    //             System.out.print(temp.data + " ");
    //             node = temp.right;
    //         }
    //     }
    // }

    // public void delete(int val){
    //     Node head = root;
    //     Node current = null;
    //     if(head==null){
    //         System.out.println("No Element is there");
    //     }
    //     if(head.data == val){
    //         root = null;
    //     }
    //     if(val>root.data){
    //         current = deleteHelper(root.right, val);
    //     }
    //     else if(val<root.data){
    //         current = deleteHelper(root.left, val);
    //     }
    // }

    // public Node findLastElement(Node node, int val){
    //     Node current = null;
        
    //     return current;
    // }

    // public Node deleteHelper(Node node, int val){
    //     Node temp = null;
    //     if(val>node.data){
    //         temp=deleteHelper(node.right, val);
    //     }
    //     else if(val<node.data){
    //         temp=deleteHelper(node.left, val);
    //     }
    //     else if(val==node.data){
    //         temp = node;
    //     }
    //     return temp;
    // }

    // public void delete(int val){

    //     Node node = root;
    //     Node temp2 = preorderDel(node,val);

    //     Node temp = root;
    //     if(temp2.data<temp.data){
    //         while(temp.left!=null){
    //             if(temp.right!=null && temp.left == null){
    //                 temp=temp.right;
    //             }
    //             else{
    //                 temp=temp.left;
    //             }
    //         }
    //     }
    //     else{
    //         while(temp.right!=null){
    //             if(temp.left!=null && temp.right == null){
    //                 temp=temp.left;
    //             }
    //             else{
    //                 temp=temp.right;
    //             }
    //         }
    //     }

    //     int dummy = temp2.data;
    //     temp2.data = temp.data;
    //     temp.data = dummy;

    // }

    // public Node preorderDel(Node node, int val) {
    //     Node temp = null;
    //     if (node != null) {
    //         if (node.data != val) {
    //             temp = preorderDel(node.left, val);
    //             if (temp == null) {
    //                 temp = preorderDel(node.right, val);
    //             }
    //         } else {
    //             temp = node;
    //         }
    //     }
    //     return temp;
    // }
    

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


    public static void main(String[] args) {

        int[] arr = {8,7,2,5,12,15};

        BinaryTree ti = new BinaryTree();

        for (int i=0;i<arr.length;i++){
            ti.insert(arr[i]);
        }

        ti.size();
        

        ti.levelOrderTraversal();

        // System.out.print("INORDER : ");
        // ti.inorder();
        // System.out.println("");

        // System.out.print("PREORDER : ");
        // ti.preorder();
        // System.out.println("");

        // System.out.print("POSTORDER : ");
        // ti.postorder();
        // System.out.println("");
        
        // ti.inorderIteration();

        // ti.delete(12);

        // System.out.print("PREORDER : ");
        // ti.preorder();
        // System.out.println("");


    }
}

