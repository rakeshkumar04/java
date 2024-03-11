package Queue;

public class DynamicQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;

    DynamicQueue() {
        this.capacity = 2; 
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    void enqueue(int element) {
        if (isHalfFull()) {
            scale();
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isHalfFull() {
        return size == capacity/2;
    }

    void scale() {
        int newCapacity = capacity * 2;
        int[] newQueue = new int[newCapacity];

        
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % capacity];
        }

        queue = newQueue;
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        DynamicQueue q = new DynamicQueue();

        for (int i = 1; i <= 10; i++) {
            q.enqueue(i);
            System.out.println("Enqueued: " + i);
        }

        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }
    }
}
