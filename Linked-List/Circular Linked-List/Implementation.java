public class Implementation {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        Node.printList(head);
    }
}
