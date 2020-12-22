public class Reverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node d1 = new Node(20);
        Node d2 = new Node(30);
        head.next=d1;
        d1.next=d2;
        d1.prev=head;
        d2.prev=d1;
        head=reverse(head);
        Node.printList(head);
    }
    static Node reverse(Node head) {
        if(head==null || head.next==null)
            return head;
        Node prev = null;
        Node curr = head;
        while (curr!=null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        prev=prev.prev;
        return prev;
    }
}
