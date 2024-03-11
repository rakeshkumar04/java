package day6_task;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Single_LinkedList3{

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

      boolean isLooped() {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}

public class SingleLL_isLooped {
    public static void main(String[] args) {

        Single_LinkedList3 s = new Single_LinkedList3();

        s.insert(1);
        s.insert(4);
        s.insert(8);
        s.insert(1);
        s.insert(4);
        s.insert(8);


        s.display();

        if (s.isLooped()) {
            System.out.println("The linked list has a loop.");
        } else {
            System.out.println("The linked list does not have a loop.");
        }
        
    }
}
