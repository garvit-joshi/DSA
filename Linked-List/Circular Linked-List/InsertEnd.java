public class InsertEnd {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        head = insertEndNode(head,5);  //O(N)
        head = insertEndNodeEffecient(head, 2); //O(1)
        Node.printList(head);
    }
    public static Node insertEndNode(Node head, int d) {
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
        return head;
    }
    public static Node insertEndNodeEffecient(Node head, int d) {
        /**
         * Uses O(1) time
         */
        Node temp = new Node(d);
        if(head==null)
            return temp;
        int t=head.data;
        head.data=temp.data;
        temp.data=t;
        temp.next=head.next;
        head.next=temp;
        return temp;
    }
}
