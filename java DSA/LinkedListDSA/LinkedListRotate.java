package LinkedListDSA;
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListRotate {

    public static ListNode rotateLinkedList(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

       
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        
        k = k % length;

        if (k == 0) {
            return head; 
        }

        
        int stepsToNewHead = length - k - 1;
        current = head;
        for (int i = 0; i < stepsToNewHead; i++) {
            current = current.next;
        }

        
        ListNode newHead = current.next;
        current.next = null;

        
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;

        return newHead;
    }

    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 2; 

        ListNode rotatedHead = rotateLinkedList(head, k);

        System.out.println("Linked List after rotation:");
        printList(rotatedHead);
    }
}
