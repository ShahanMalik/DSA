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
        head.previous = node;
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
            head.next.previous = null;
        } else {
            Node temp = head;
            for (int a = 0; a < index - 1; a++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp; // not use temp.next.next.next.previous = temp; because temp is updated above
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
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.previous;
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "  ");
            node = node.next;
        }
    }

}
