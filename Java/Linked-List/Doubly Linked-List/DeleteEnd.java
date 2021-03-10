public class DeleteEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
        head=deleteEndNode(head);
        Node.printList(head);
    }
    static Node deleteEndNode(Node head) {
        if(head==null || head.next==null)
            return null;
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;
    }
}
