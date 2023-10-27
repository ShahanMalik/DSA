package Queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(12);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.show();
        q.deQueue();
        q.show();

        // Queue queue = new Queue(5);
        // queue.enqueue(1);
        // queue.enqueue(2);
        // queue.enqueue(3);
        // queue.enqueue(4);
        // queue.display();
        // queue.dequeue();
        // queue.dequeue();
        // queue.display();
    }
}
