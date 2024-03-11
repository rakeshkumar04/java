package day6_task;

import java.util.Stack;

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


   

     public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        head = stack.pop();
        current = head;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null; 
    }
}

public class SinglyLL_Rev_Stack {
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
