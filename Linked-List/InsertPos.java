public class InsertPos {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(30);
        head.next.next= new Node(40);
        head.next.next.next= new Node(50);
        head=insertPosNode(head, 20, 2);
        Node.printList(head);
    }
    static Node insertPosNode(Node head, int x, int pos) {
        Node temp=new Node(x);
        if(head==null && pos==1) {
            return temp;
        }
        if(head==null) {
            return null;
        }
        if(pos==1) {
            temp.next=head;
            return temp;
        }   
        Node curr = head;
        for(int i=1;i<pos-1 && curr!=null;i++) {
            curr=curr.next;
        }
        if(curr==null)
            return head;
        temp.next = curr.next;
        curr.next=temp;
        return head;
    }
}
