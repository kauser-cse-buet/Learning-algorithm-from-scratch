package LinkedListManager;

public class SingleNode {
    public SingleNode next;
    public int key;
    public SingleNode(int key){
        this.key = key;
        this.next = null;
    }

    @Override
    public String toString() {
        return "(" + key + ')';
    }
}
