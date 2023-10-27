package Queue;

public class Queue {
    int[] queue = new int[5];
    int front;
    int rear;
    int top = -1;

    public void enQueue(int value) {
        if (top >= 5) {
            System.out.println("queue is full" + queue.length);
        } else {
            top++;
            queue[top] = value;
        }
    }

    public void deQueue() {
        if (top <= 0) {
            System.out.println("queue is empty" + queue.length);
        } else {
            front++;
            for (int a = front; a <= top; a++) {
                queue[a - 1] = queue[a];
                System.out.println("deque value  " + queue[a - 1]);
            }
            top--;
            queue[top + 1] = 0;
            System.out.println("sdfjksfhjksdfhk" + top);

        }
    }

    public void show() {
        System.out.println("for each loop");
        for (int fe : queue) {
            System.out.println(fe);
        }
    }
}
