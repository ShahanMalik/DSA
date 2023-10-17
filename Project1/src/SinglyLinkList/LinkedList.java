package SinglyLinkList;

public class LinkedList {
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            tail = node;
        }
    }

    public void insertAtFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        if (index == 0) {
            insertAtFirst(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void insertAtLast(int value) {
        Node node = new Node();
        node.data = value;
        Node n = tail;
        n.next = node;
        node = tail;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        }
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
        n1 = null;
    }

    public void deleteAtLast() {
        Node n = head;
        for (int a = 0; (n.next != tail); a++) {
            n = n.next;
        }
        n.next = tail;
        n = n.next;
        n.data = 0;
        n.next = null;

    }

    public void reverseLinkList() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            // System.out.println(current.data);
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        show();
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void findIndex(int value) {
        Node n = head;
        while (n.next != null) {
            if (n.data == value) {
                System.out.println("next of " + value + " is " + n.next);
                return;
            }
            n = n.next;
        }
    }
}
