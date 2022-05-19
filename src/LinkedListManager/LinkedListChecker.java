package LinkedListManager;

public class LinkedListChecker {
    public static void main(String[] args){
        SingleLinkedList sl = new SingleLinkedList();
        sl.head = new SingleNode(1);
        System.out.println(sl);
        sl.insert(sl, new SingleNode(2));
        System.out.println(sl);
        sl.insert(sl, new SingleNode(10));
        System.out.println(sl);
    }
}
