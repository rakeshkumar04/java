package LinkedListDSA;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
}

class CircularLinkedList{
    Node tail;
    Node head;
    int size;

    CircularLinkedList(){
        tail = null;
        head = null;
        size = 0;
    }

    int size() {
        return size;
     }
  
    boolean isEmpty() {
        return size == 0;
    }

    int find(int k) {
        Node current = head;
        int index = 0;
    
        if (head == null) {
            return -1; 
        } 
        else {
            do {
                if (current.data == k) {
                    return index;
                }
                current = current.next;
                index++;
            } while (current != head);
    
            return -1;
        }
    }
    
    

    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
           head = newNode;
           tail = head;
           size++;
           return;
        } 
        else {

            tail.next = newNode;
            tail = newNode;
            tail.next = head;

            size++;
        }
    }

    void removeFirst(){
        if( head == null){
            return;
        }
        else{
            head = head.next;
            tail.next = head;
        }
    }

    

    void removeLast() {
        if (head == null) {
            return;
        } else if (head == tail) {
            
            head = null;
            tail = null;
            size = 0;
            return;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
            size--;
        }
    }
    

    void display() {
        if (tail == null) {
            System.out.println(head.data);
            return;
        }
        else{
            Node n = head;
            while (n != tail) {
                System.out.print(n.data + " --> ");
                n = n.next;
            }
            System.out.println(n.data);
        }
     }
  
}

public class CicularLL {
    public static void main(String[] args) {
        
        CircularLinkedList s = new CircularLinkedList();

        s.insert(1);
        s.insert(4);
        s.insert(8);

        s.display();

        System.out.println(s.find(8));

    }
}
