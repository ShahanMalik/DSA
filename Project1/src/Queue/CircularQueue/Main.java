package Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
    }
}
