public class DeleteEnd {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head=deleteEndNode(head);
        Node.printList(head);
    }
    static Node deleteEndNode(Node head) {
        if (head==null || head.next==null)
            return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
}
