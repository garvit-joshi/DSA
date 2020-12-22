public class InsertEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
        head=insertEnd(head, 40);
        Node.printList(head);
    }
    static Node insertEnd(Node head, int x) {
        Node temp=new Node(x);
        if(head==null)
            return temp;
        Node curr = head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
}
