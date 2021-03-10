import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
        printBFS(root);
    }
    static void printBFS(Node root){
        /**
         * 
         * Prints Breadth First Search of a Tree
         * Also Called Level Order Traversal
         * Time Complexity: O(n)
         * Auxaliry Space: O(n)
         */
        if(root == null){
            return;
        }
        Queue <Node> discovered = new LinkedList <>();
        discovered.add(root);
        while(!discovered.isEmpty()) //==false
        {
            Node curr = discovered.poll();
            System.out.println(curr.key);
            if(curr.left!=null)
                discovered.add(curr.left);
            if(curr.right!=null)
                discovered.add(curr.right);
        }
    }
}