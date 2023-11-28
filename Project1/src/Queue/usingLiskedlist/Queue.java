package Queue.usingLiskedlist;

public class Queue {
    Node tail;

    public void enqueue(int value) {
        Node node = new Node(value);
        if (tail == null) {
            tail = node;
            tail.next = tail;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
    }

    public void dequeue() {
        if (tail == null) {
            System.out.println("Queue is empty");
        } else if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void front() {
        if (tail == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(tail.next.value);
        }
    }

    public void show() {
        if (tail == null) {
            System.out.println("Queue is empty");
        } else {
            Node node = tail.next;
            do {
                System.out.println(node.value);
                node = node.next;
            } while (node != tail.next);
        }
    }
}
