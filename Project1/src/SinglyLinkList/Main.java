package SinglyLinkList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insertAtFirst(222);
        list.insertAt(0, 333);
        list.show();
        System.out.println("after delete");
        list.deleteAt(3);
        list.show();
        System.out.println("insert at last");
        list.insertAtLast(999);
        list.show();
        System.out.println("delete  at last");
        list.deleteAtLast();
        list.show();

        System.out.println("find index");
        list.findIndex(1);
        System.out.println("reverse");
        list.reverseLinkList();
        list.show();
    }
}
