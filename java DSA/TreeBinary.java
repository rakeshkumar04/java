class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int data){
        this.data=data;
    }
}

public class TreeBinary {
    
    BinaryNode root;
    int height =0;

    public void insert(int data){
        root = insertRec(root , data);
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
        }

    }

    public BinaryNode insertRec(BinaryNode root , int data){
        if (root == null){
            root = new BinaryNode(data);
        }
        else{
            if (root.right!=null && root.left==null){
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

    public void inorderRec(BinaryNode root){
        if (root!=null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);

        }
    }

    public void preorderRec(BinaryNode root){
        if (root!=null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);

        }
    }

    public void postorderRec(BinaryNode root){
        if (root!=null){
            
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,2,5,12,15};

        TreeBinary ti = new TreeBinary();

        for (int i=0;i<arr.length;i++){
            ti.insert(arr[i]);
        }

        System.out.print("INORDER : ");
        ti.inorder();
        System.out.println("");

        System.out.print("PREORDER : ");
        ti.preorder();
        System.out.println("");

        System.out.print("POSTORDER : ");
        ti.postorder();
        System.out.println("");
    }
}
