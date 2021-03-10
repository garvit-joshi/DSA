public class Implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
    }
}
