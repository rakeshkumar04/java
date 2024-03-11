package StackDSA;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int element = stack.pop();
        reverse(stack);

        insertAtBottom(stack, element);
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int topElement = stack.pop();
        insertAtBottom(stack, element);
        stack.push(topElement);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

       
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        System.out.println("Original Stack: " + stack);

        
        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
