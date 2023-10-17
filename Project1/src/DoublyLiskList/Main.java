package DoublyLiskList;

public class Main {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.show();
        list.insertAtStart(1);
        list.insertAt(2, 20);
        list.show();
        list.deleteAt(2);
        list.show();
    }
}
