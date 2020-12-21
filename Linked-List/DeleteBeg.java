public class DeleteBeg {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head=deleteBegNode(head);
        Node.printList(head);
    }
    static Node deleteBegNode(Node head) {
        if (head==null)
            return null;
        head=head.next;
        return head;
    }
}
