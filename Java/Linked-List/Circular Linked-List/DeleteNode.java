public class DeleteNode {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        head = deleteNode(head,1);  //O(N)
        Node.printList(head);
    }
    public static Node deleteNode(Node head, int pos) {
        if(head==null)
            return null;
        if(pos==1)
            return DeleteBeg.deleteBegNodeEffecient(head);  //O(1)
        Node curr=head.next;
        int counter=2;
        while(curr!=head)
        {
            if(counter==pos-1)
                curr.next=curr.next.next;
            counter++;
            curr=curr.next;
        }
        return head;
    }

}
