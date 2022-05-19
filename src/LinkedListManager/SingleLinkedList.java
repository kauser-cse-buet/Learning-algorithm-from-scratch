package LinkedListManager;

public class SingleLinkedList {
    public SingleNode head;

    public void insert(SingleLinkedList L, SingleNode x){
        x.next = L.head;
        L.head = x;
    }

    @Override
    public String  toString(){
        SingleNode x= head;
        String output = "";
        while (x != null){
            output += x + "->";
            x = x.next;
        }
        return output;
    }
}
