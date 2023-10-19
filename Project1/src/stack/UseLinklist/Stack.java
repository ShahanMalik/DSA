package stack.UseLinklist;

public class Stack {
    int len = 4;
    int top;
    Node head;
    Node tail;

    public void push(int value) {
        if (top >= len) {
            System.out.println("Stack OverFlow");
        } else {
            Node node = new Node();
            top++;
            node.data = value;
            if (head == null) {
                node.next = null;
                head = node;
                tail = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
                tail = node;
            }
        }
    }

    public void peek() {
        Node temp = head;
        for (int a = 0; a < top - 1; a++) {
            temp = temp.next;
            // System.out.println("a" + a);
        }
        System.out.println(temp.data);
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Stack Underflow");
        } else {
            Node temp = head;
            top--;
            for (int a = 0; a < top - 1; a++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            temp = temp.next;
            temp = null;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + "  ");
            node = node.next;
        }
        System.out.print(node.data + "  ");
        System.out.println();
    }
}
