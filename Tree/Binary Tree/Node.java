import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key = k;
        left=right=null;
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
    static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key+" ");
        }
    }
    static int getHeight(Node root)
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
    static void printKthDigits(Node root, int k) {
        /**
         * Takes 'k' as argument and prints
         * all Kth Element away from root.
         */
        if(root == null)
            return;
        if (k==1)
            System.out.println(root.key+" ");
        else {
            printKthDigits(root.left, k-1);
            printKthDigits(root.right, k-1);
        }
    }
    static int getSize(Node root)
    {
        /**
         * gets no. of elements in a binary tree
         * Time Complexity: O(n)
         * Aux. Space: O(h)
         */
        if(root == null)
            return 0;
        return 1+getSize(root.left)+getHeight(root.right);
    }
    static int getMax(Node root)
    {
        /**
         * Returns max. value in a tree
         * Time Complexity: O(n)
         * Aux. Space: 
         */
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
    }
    public static boolean childrenSum(Node root) {
        /**
         * Returns true if Tree follows Children Sum Property
         */
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.key;
        if(root.right!=null)
            sum+=root.right.key;
        return (root.key==sum && childrenSum(root.left) && childrenSum(root.right));
    }
    public static int maxWidth(Node root) {
        /**
         * Returns Max width of a binary tree
         * Uses BFS
         * Time Complexity: O(n)
         */
        if (root==null)
            return 0;
        Queue<Node> discovered= new LinkedList<Node>();
        discovered.add(root);
        int res=0;
        while(!discovered.isEmpty())
        {
            int count=discovered.size();
            res=Math.max(res, count);
            for(int i=0;i<count;i++) {
                Node curr = discovered.poll();
                if(curr.left!=null)
                    discovered.add(curr.left);
                if(curr.right!=null)
                    discovered.add(curr.right);

            }
        }
        return res;
    }
}