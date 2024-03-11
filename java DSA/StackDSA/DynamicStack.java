package StackDSA;

public class DynamicStack {
    int[] stack;
    int top;
    int capacity;

    DynamicStack() {
        this.capacity = 2;
        this.stack = new int[capacity];
        this.top = 0;
    }

    void push(int element) {
        if (top == capacity/2) {
            scale();
        }
        stack[top++] = element;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[--top];
    }

    boolean isEmpty() {
        return top == 0;
    }

    void scale() {
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];

        for (int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }
        
        //System.arraycopy(stack, 0, newStack, 0, size);

        stack = newStack;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        DynamicStack st = new DynamicStack();

        for (int i = 1; i <= 10; i++) {
            st.push(i);
            System.out.println("Pushed: " + i);
        }

        while (!st.isEmpty()) {
            System.out.println("Popped: " + st.pop());
        }
    }
}
