package day6_task;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Single_LinkedList4{

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

     

     Node removeFirst() {
        if (head == null) {
           return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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

      void rotate(int k) {

        if (head == null || k <= 0) {
            return; 
        }

        int length = length();
        k = k % length; 

        if (k == 0) {
            return;
        }

        Node current = head;
        int count = 1;

        
        while (count < length - k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return; 
        }

        
        Node newHead = current.next;
        current.next = null; 
        Node temp = newHead;

        
        while (temp.next != null) {
            temp = temp.next;
        }

        
        temp.next = head;

        head = newHead;
    }

}

public class SingleLL_rotate {
    public static void main(String[] args) {

        Single_LinkedList4 s = new Single_LinkedList4();

        s.insert(1);
        s.insert(4);
        s.insert(8);

        s.display();

        s.rotate(2);

        s.display();
        
    }
}
