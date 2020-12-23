public class DeleteBeg {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        head= deleteBegNode(head);        //O(n)
        head= deleteBegNodeEffecient(head);    //O(1)
        Node.printList(head);
    }
    public static Node deleteBegNode(Node head) {
        /**
         * Uses O(N) time
         */
        if(head==null || head.next==null)
            return null;
        Node curr = head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=head.next;
        return curr.next;
    }
    public static Node deleteBegNodeEffecient(Node head) {
        /**
         * Uses O(1) time
         */
        if(head==null || head.next==null)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
}
