package Tree_DSA;

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    Node() {}

    void display() {
        System.out.print("(" + data + ")");
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");
        while (current != null && current.data != data) {
            System.out.print(current.data + " ");

            if (current.data > data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    }

    void insert(int data) {
        Node tempNode = new Node();
        tempNode.data = data;

        if (root == null) {
            root = tempNode;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                parent = current;
                if (data < parent.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = tempNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = tempNode;
                        return;
                    }
                }
            }
        }
    }

    void traverse(int traversalType) {
        switch (traversalType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }
}

public class TreeDSA {
    public static void main(String[] args) {
        Tree t = new Tree();

        t.insert(5);
        t.insert(3);
        t.insert(7);
        t.insert(1);
        t.insert(4);
        t.insert(5);
        t.insert(6);

        t.traverse(3);
    }
}
