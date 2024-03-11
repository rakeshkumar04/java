import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node1 {
    int data;
    Node1 right;
    Node1 left;

    Node1(int data) {
        this.data = data;
    }
}

public class BinaryTree2 {

    Node1 root;
    int height = 0;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public List<Integer> toArray() {
        List<Integer> arr = new ArrayList<>();
        if (root == null) {
            return arr;
        }
    
        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            Node1 current = queue.poll();
            arr.add(current.data);
    
            if (current.left != null) {
                queue.add(current.left);
            }
    
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    
        return arr;
    }

    public void convertToBalancedBST(List<Integer> sortedList) {
        root = sortedListToBST(sortedList, 0, sortedList.size() - 1);
    }


    private Node1 sortedListToBST(List<Integer> sortedList, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node1 node = new Node1(sortedList.get(mid));

        node.left = sortedListToBST(sortedList, start, mid - 1);
        node.right = sortedListToBST(sortedList, mid + 1, end);

        return node;
    }
    

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node1 current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public void size() {
        System.out.println("Size: " + sizeRec(root));
    }

    public int sizeRec(Node1 root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        count = 1 + sizeRec(root.left) + sizeRec(root.right);
        return count;
    }

    public void height() {
        int height = calculateHeight(root);
        System.out.println("Height: " + height);
    }

    private int calculateHeight(Node1 root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = calculateHeight(root.left);
            int rightHeight = calculateHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public Node1 insertRec(Node1 root, int data) {
        if (root == null) {
            root = new Node1(data);
        } else {
            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else {
                root.right = insertRec(root.right, data);
            }
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    public void preorder() {
        preorderRec(root);
    }

    public void postorder() {
        postorderRec(root);
    }

    public void inorderRec(Node1 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorderRec(Node1 root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorderRec(Node1 right) {
        if (right != null) {
            postorderRec(right.left);
            postorderRec(right.right);
            System.out.print(right.data + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 12, 17};

        BinaryTree2 ti = new BinaryTree2();

        for (int i = 0; i < arr.length; i++) {
            ti.insert(arr[i]);
        }

        ti.size();

        // ti.height();

        // System.out.print("Level Order Traversal: ");
        // ti.levelOrderTraversal();
        // System.out.println("");

        // System.out.print("INORDER : ");
        // ti.inorder();
        // System.out.println("");

        // System.out.print("PREORDER : ");
        // ti.preorder();
        // System.out.println("");

        // System.out.print("POSTORDER : ");
        // ti.postorder();
        // System.out.println("");

        // List<Integer> arrayList = ti.toArray();
        // System.out.println("Binary Tree converted to ArrayList: " + arrayList);


        // // Convert the ArrayList to a balanced BST
        // ti.convertToBalancedBST(arrayList);

        // // Display the balanced BST
        // System.out.print("Level Order Traversal of Balanced BST: ");
        // ti.levelOrderTraversal();
        // System.out.println("");

    //     12
    //     /  \
    //    8    17
    //   / \   /
    //  7   2 5
 
    }
}
