package day6_task;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Single_LinkedList{

    Node head;

    public void insert(int value) {
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

     void display() {
        Node current = head;
        while (current != null) {
           System.out.print(current.data + " --> ");
           current = current.next;
        }
        System.out.print("null");
        System.out.println();
     }

     public int length() {
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
         head = recursion(head, null);
     }

     Node recursion(Node current, Node prev) {
      if (current == null) {
          return prev;
      }
      Node next = current.next;
      current.next = prev;
      return recursion(next, current);
      }
}

public class SinglyLL_Rev_Recurse {
    public static void main(String[] args) {

        Single_LinkedList s = new Single_LinkedList();

        s.insert(1);
        s.insert(4);
        s.insert(8);

        s.display();

        s.reverse();

        s.display();
        
    }
}
