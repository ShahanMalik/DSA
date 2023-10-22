package LabAssignment2;

public class SInglyLinkedList {
    Node doublyHead;
    Node doublyTail;
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void insertIndoubleLinkedList() {
        Node node = head;
        while (node.next != null) {
            doublyLinkedList(node.data);
            node = node.next;
        }
        doublyLinkedList(node.data);
    }

    public void doublyLinkedList(int data) {
        Node node = new Node(data);
        if (doublyHead == null) {
            doublyHead = node;
            doublyTail = node;
        } else {
            doublyTail.next = node;
            node.previous = doublyTail;
            doublyTail = node;
        }
    }

    public void show() {
        System.out.println("Doubly LinkedList:");
        Node node = doublyHead;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + " ");
    }

}
