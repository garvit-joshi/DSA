public class InsertBeg {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head=insertBegiNode(head, 5);
        head=insertBegiNode(head, 2);
        Node.printList(head);
    }
    static Node insertBegiNode(Node head, int x) {
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
}
