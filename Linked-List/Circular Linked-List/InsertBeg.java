public class InsertBeg {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        head= insertBegNode(head,50);        //O(n)
        head= insertBegNodeEffecient(head, 60);    //O(1)
        Node.printList(head);
    }
    public static Node insertBegNode(Node head, int d) {
        /**
         * Uses O(N) time
         */
        Node temp = new Node(d);
        if(head==null)
            return temp;
        Node curr = head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=temp;
        temp.next=head;
        return temp;
    }
    public static Node insertBegNodeEffecient(Node head, int d) {
        /**
         * Uses O(1) time
         */
        Node temp = new Node(d);
        if(head==null)
            return temp;
        int t=head.data;
        head.data=temp.data;
        temp.next=head.next;
        head.next=temp;
        temp.data=t;
        return head;
    }
}
