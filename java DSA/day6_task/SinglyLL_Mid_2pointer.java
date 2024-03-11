package day6_task;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Single_LinkedList2{

    Node head;

    void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
           head = newNode;
           return;
        }
        Node current = head;
        while (current.next != null) {
           current = current.next;
        }
        current.next = newNode;
     }

     

     void removeFirst() {
        if (head == null) {
           return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        
     }




     void display() {
        Node current = head;
        while (current != null) {
           System.out.print(current.data + " --> ");
           current = current.next;
        }
        System.out.print("null");
        System.out.println();
     }

     int length() {
        if (head == null) {
           return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
           count++;
           current = current.next;
        }
        return count;
     }

     void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
     }

     void reverse() {
         if(head == null){
            return;
         }
         Node prev = null;
         Node current = head;
         Node next = null;
         while (current != null) {
             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         head = prev;
      }

      public Node getMiddleNode() {
        if (head == null) {
           return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
  
        while (fastPtr != null && fastPtr.next != null) {
           slowPtr = slowPtr.next;
           fastPtr = fastPtr.next.next;
        }
        return slowPtr;
     }
}

public class SinglyLL_Mid_2pointer {
    public static void main(String[] args) {

        Single_LinkedList2 s = new Single_LinkedList2();

        s.insert(1);
        s.insert(4);
        s.insert(8);

        s.display();


        Node middleNode = s.getMiddleNode();

        
        if (middleNode != null) {
            System.out.println("Middle Node Value: " + middleNode.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
