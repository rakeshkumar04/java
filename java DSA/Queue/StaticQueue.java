package Queue;

public class StaticQueue {
    static int [] q = new int[5];
    static int enq = 0;
    static int deq = q.length;

    public static void main(String[] args) {
    
        enqueue(5,q);

    }

    static void enqueue(int i, int[] q) {
        if(enq>q.length){
            System.out.println("Queue is Full");
        }
        else{
            q[enq] = i;
            enq++;
        }
    }

    static void dequeue(int i, int[] q) {
        if(deq<0){
            System.out.println("Queue is Empty");
        }
        else{
            deq--;
        }
    }
}
