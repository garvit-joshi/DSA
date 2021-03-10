public class InsertBeg {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
        head=insertBeg(head, 5);
        Node.printList(head);
    }
    static Node insertBeg(Node head, int x) {
        Node temp=new Node(x);
        temp.next=head;
        if(head!=null)
            head.prev=temp;
        return temp;
    }
}
