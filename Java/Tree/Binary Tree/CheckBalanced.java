public class CheckBalanced {
    public static void main(String[] args) {
        Node root= new Node(10);
        root.left= new Node(20);
        root.right=new Node(30);
        root.left.right=new Node(40);
        root.left.left=new Node(50);
        root.left.right.right=new Node(60);
        root.left.right.left=new Node(70);
        root.right.right=new Node(80);
        root.right.left=new Node(90);
        root.right.right.right=new Node(100);
        root.right.right.left=new Node(110);
        if(isBalanced(root)==-1)
        {
            System.out.println("Not Balanced");
        }
        else
        {
            System.out.println("Balanced");
        }
        System.out.println("Max Width:"+Node.maxWidth(root));
    }
    static int isBalanced(Node root)
    {
        /**
         * Time Complexity=O(n)
         */
        if(root==null)
            return 0;
        int lh=isBalanced(root.left);
        if(lh==-1)
            return -1;
        int rh=isBalanced(root.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh, rh)+1;
    }
}