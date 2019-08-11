import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFSonBST {

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void BFSIterative(Node root){
        Queue<Node> q= new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.remove();
            System.out.print(node.data);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
    }

    public static int getHeight(Node root){
        if(root==null)return -1;
        else {
            return (1+ Math.max(getHeight(root.left),getHeight(root.right)));
        }
    }
    public static void runByHeight(Node root){
        int h = getHeight(root);
        for(int i=0;i<=h;i++){
            BFSRecursive(root,i);
        }
    }
    public static  void BFSRecursive(Node root, int level){
        if(root==null) return;
        if(level==0)  System.out.print(root.data + " ");
        else {
            BFSRecursive(root.left,level-1);
            BFSRecursive(root.right,level-1);
        }
    }

    public static void DFSIterative(Node root){
        Stack<Node> s = new Stack<Node>();
        s.push(root);
        while(!s.empty()){
            Node node = s.pop();
            System.out.print(node.data);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
    }

    public static  void DFSRecursive(Node root){
        if(root!=null){
            System.out.print(root.data);//similar to pre-order traversal
            DFSRecursive(root.left);
            DFSRecursive(root.right);
        }
    }

    public static void main(String args[]){
        Node root=null;

        root=insert(root,3);
        root=insert(root,5);
        root=insert(root,2);
        root=insert(root,1);
        root=insert(root,4);
        root=insert(root,6);
        root=insert(root,7);

        System.out.print("BFS interative: ");
        BFSIterative(root);
        System.out.println("");
        System.out.print("BFS Recursive: ");
        runByHeight(root);
        System.out.println("");
        System.out.print("DFS interative: ");
        DFSIterative(root);
        System.out.println("");
        System.out.print("DFS Recursive: ");
        DFSRecursive(root);
    }

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
}
