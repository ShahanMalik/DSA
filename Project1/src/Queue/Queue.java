package Queue;

public class Queue {
    // create a circular queue
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = item;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % size;
        count--;
        return item;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

}
