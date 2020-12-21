public class InsertEnd {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head=insertEndNode(head, 50);
        Node.printList(head);
    }
    static Node insertEndNode(Node head, int x) {
        Node temp=new Node(x);
        if (head==null)
            return temp;
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        return head;
    }
}
