package DoublyLiskList;

public class Main {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.show();
        System.out.println("");
        list.insertAtStart(1);
        list.insertAt(2, 20);
        list.show();
        System.out.println();
        list.deleteAt(2);
        list.show();
        System.out.println();
        list.reverse();
        System.out.println();
        list.show();
    }
}
