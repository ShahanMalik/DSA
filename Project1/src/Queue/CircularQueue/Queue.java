package Queue.CircularQueue;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public void enqueue(int item) {
        if (front == size) {
            System.out.println("Queue is full");
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = item;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        int item = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

    }

    public void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }

    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");

        }
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[rear]);
    }
}
