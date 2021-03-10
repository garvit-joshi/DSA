public class DeleteBeg {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
        head=deleteBegNode(head);
        Node.printList(head);
    }
    static Node deleteBegNode(Node head) {
        if (head==null)
            return null;
        if(head.next==null)
            return null;
        head=head.next;
        head.prev=null;
        return head;
    }
}