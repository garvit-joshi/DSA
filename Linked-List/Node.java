public class Node {
    /**
     * Node class will be a used to create
     * Linked list
     * @author Garvit Joshi
     */
    
    int data;
    Node next;  //Self Referential
    Node (int x) //Constructor
    {
        data=x;
        next=null;
    }
    public static void printList(Node head) {
        /**
         * Printing the linked list(Iterative)
         */
        Node curr= head;
        while(curr!=null)
        {
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void rPrint(Node head) {
        /**
         * Printing the linked list(Recursive)
         */
        if (head==null) {
            return;
        }
        System.out.println(head.data+" ");
        rPrint(head.next);
    }
}
