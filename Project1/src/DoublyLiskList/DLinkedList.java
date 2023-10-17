package DoublyLiskList;

public class DLinkedList {
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
            node.previous = null;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        node.previous = node;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next.previous = node;
            n.next = node;
            node.previous = n;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
            head.previous = null;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1.next.previous = n;
            n1 = null;
        }
    }

    public void deleteLast() {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.previous.next = null;
        n = null;
    }

    public void deleteFirst() {
        head = head.next;
        head.previous = null;
    }

    public void reverse() {
        Node n = head;
        Node temp = null;
        while (n != null) {
            temp = n.previous;
            n.previous = n.next;
            n.next = temp;
            n = n.previous;
        }
        if (temp != null) {
            head = temp.previous;
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

}
