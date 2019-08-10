import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    static Node root=null;
    static Node left;
    static Node right;
    public  static void main(String[] arg){
        //int[] nodeList= { 3,5,2,1,4,6,7};
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(6);
        bst.insert(7);

        System.out.print("Inorder: ");
        bst.displayInorder(root);
        System.out.println("");
        System.out.print("Preorder: ");
        bst.displayPreorder(root);
        System.out.println("");
        System.out.print("Postorder: ");
        bst.displayPostorder(root);
        System.out.println("");
        System.out.println("Hieght of tree: "+ bst.calculateHeight(root));

    }

    public void insert(int data){
        Node newNode = new Node(data);
        Node parent = null;
        Node current = root;

        if(root==null){
            root = newNode;
        }
        else{
            while(current!=null){
                parent=current;

                if(data<current.data){
                    current = current.left;
                     if(current == null){
                         parent.left = newNode;
                     }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                    }
                }
            }

        }
    }

    public void displayInorder(Node root){
        Node current = root;
        if(current!=null){
            displayInorder(current.left);
            System.out.print(" " + current.data);
            displayInorder(current.right);

        }
    }

    public void displayPreorder(Node root){
        Node current = root;
        if(current!=null){
            System.out.print(" " + current.data);
            displayPreorder(current.left);
            displayPreorder(current.right);

        }
    }

    public void displayPostorder(Node root){
        Node current = root;
        if(current!=null){
            displayPostorder(current.left);
            displayPostorder(current.right);
            System.out.print(" " + current.data);
        }
    }

    public int calculateHeight(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        int height = -1;
        // add root to the queue
        q.add(root);
        // add null as marker
        q.add(null);
        while (q.isEmpty() == false) {
            Node n = q.remove();
            // check if n is null, if yes, we have reached to the end of the
            // current level, increment the height by 1, and add the another
            // null as marker for next level
            if (n == null) {
                // before adding null, check if queue is empty, which means we
                // have traveled all the levels
                if(!q.isEmpty()){
                    q.add(null);
                }
                height++;
            }else{
                // else add the children of extracted node.
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }
        return height;
    }

    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }

        public String toString(){
            return("data: " + this.data + " left: "+this.left + " right: "+this.right);
        }
    }
}
