public class SearchEle {
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        searchElement(head, 90);
    }
    static int searchElement(Node head, int x) {
        if (head==null) {
            return -1;           //Head is NULL
        }
        Node curr=head;
        int counter=1;
        while(curr!=null) {
            if(curr.data==x){
                return counter; //Data found at position counter
            }
            curr=curr.next;
            counter++;
        }
        return -1;              //Data Not Found
    }
}
