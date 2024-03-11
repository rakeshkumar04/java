package day6_task;

import java.util.NoSuchElementException;


class Node{
   int data; // Can be any generic type
   Node next;
   Node previous;

   public Node(int data) {
      this.data = data;
   }
}

class DubleLL {

   Node head;
   Node tail;
   int length;

   public DubleLL() {
      this.head = null;
      this.tail = null;
      this.length = 0;
   }

   public boolean isEmpty() {
      return length == 0;
   }

   public int length() {
      return length;
   }

   public void displayForward() {
      if (head == null) {
         return;
      }

      Node temp = head;
      while (temp != null) {
         System.out.print(temp.data + " --> ");
         temp = temp.next;
      }
      System.out.println("null");
   }

   public void displayBackward() {
      if (head == null) {
         return;
      }

      Node temp = tail;
      while (temp != null) {
         System.out.print(temp.data + " --> ");
         temp = temp.previous;
      }
      System.out.println("null");
   }

   public void insertFirst(int value) {
      Node newNode = new Node(value);
      if (isEmpty()) {
         tail = newNode;
      } else {
         head.previous = newNode;
      }
      newNode.next = head;
      head = newNode;
      length++;
   }

   public void insertEnd(int value) {
      Node newNode = new Node(value);
      if (isEmpty()) {
         head = newNode;
      } else {
         tail.next = newNode;
         newNode.previous = tail;
      }
      tail = newNode;
      length++;
   }

   public Node deleteFirst() {
      if (isEmpty()) {
         throw new NoSuchElementException();
      }

      Node temp = head;
      if (head == tail) {
         tail = null;
      } else {
         head.next.previous = null;
      }
      head = head.next;
      temp.next = null;
      length--;
      return temp;
   }

   public Node deleteLast() {
      if (isEmpty()) {
         throw new NoSuchElementException();
      }

      Node temp = tail;
      if (head == tail) {
         head = null;
      } else {
         tail.previous.next = null;
      }
      tail = tail.previous;
      temp.previous = null;
      length--;
      return temp;
   }

   public static void main(String[] args) {
      DubleLL d = new DubleLL();
      d.insertEnd(1);
      d.insertEnd(2);
      d.insertEnd(3);

      d.displayForward();

      d.deleteLast();
      d.deleteLast();

      d.displayForward();
   }
}   