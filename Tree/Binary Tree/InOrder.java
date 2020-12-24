public class InOrder {
    public static void main(String[] args) {
        Node root= new Node(10);
        root.left= new Node(20);
        root.right=new Node(30);
        root.left.right=new Node(25);
        root.left.left=new Node(25);
        root.left.right.right=new Node(25);
        root.left.right.left=new Node(25);
        root.right.right=new Node(25);
        root.right.left=new Node(25);
        root.right.right.right=new Node(25);
        root.right.right.left=new Node(25);
    }
    static void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.println(root.key+" ");
            inOrder(root.right);
        }
    }
}
