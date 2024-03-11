package Tree_DSA;

class Node{
    int data;
    Node left;
    Node right;

    Node(){}

    Node(int data){
        this.data = data;
    }
}

class ArrayTree{
    Node root;

    ArrayTree(){
        root = null;
    }

    void insert(int [] arr){
        int mid=arr[(arr.length/2)];
        int leftptr;
        int rigthptr;
        
        root.data = mid;

        
    }
}

public class ArrayTree_DSA {
    public static void main(String[] args) {
        int [] input = new int[]{1,2,3,4,5,6,7};

        ArrayTree tree = new ArrayTree();

        tree.insert(input);

    }
}
