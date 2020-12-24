public class Node {
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key = k;
        left=right=null;
    }
    void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.println(root.key+" ");
            inOrder(root.right);
        }
    }
    void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key+" ");
        }
    }
    int getHeight(Node root)
    {
        /**
         * Returns the max. height of tree
         * Time - O(N)
         * Space - O(h)
         */
        if(root==null)
            return 0;
        else
            return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    void printKthDigit(Node root, int k) {
        /**
         * Takes 'k' as argument and prints
         * all Kth Element away from root.
         */
        if(root == null)
            return;
        if (k==1)
            System.out.println(root.key+" ");
        else {
            printKthDigit(root.left, k-1);
            printKthDigit(root.right, k-1);
        }
    }
}