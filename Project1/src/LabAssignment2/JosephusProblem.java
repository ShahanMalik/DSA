package LabAssignment2;

// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//     }
// }

public class JosephusProblem {
    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1; // Base case: Only one person remains.
        }

        // Create a circular linked list with n nodes.
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = head; // Make the list circular.

        // Start eliminating people until only one remains.
        Node prev = null;
        current = head;
        int count = 1;
        while (n > 1) {
            if (count == k) {
                // Eliminate the current person.
                prev.next = current.next;
                current = current.next;
                n--;
                count = 1;
            } else {
                prev = current;
                current = current.next;
                count++;
            }
        }

        return current.data;
    }

    public static void main(String[] args) {
        int n = 7; // Number of people
        int k = 3; // Counting interval
        int survivor = josephus(n, k);
        System.out.println("The survivor is person #" + survivor);
    }
}
