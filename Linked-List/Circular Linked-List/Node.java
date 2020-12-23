public class Node {
    /**
     * Node class will be a used to create
     * Doubly Linked list
     * @author Garvit Joshi
     */
    int data;
    Node next;
    Node(int d) {
        data=d;
        next=null;
    } 
    public static void printList(Node head) {
        /**
         * Printing the linked list(Iterative)
         */
        if(head==null)
        {
            System.out.println("No Data Found");
            return;
        }
        System.out.println(head.data+" ");
        Node curr= head.next;
        while(curr!=head)
        {
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}