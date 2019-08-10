import java.util.*;
import java.io.*;

    class BSTRecursive{

        public static int getHeight(Node root){
            if(root==null)return -1;
            else {
               return (1+ Math.max(getHeight(root.left),getHeight(root.right)));
            }
        }

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

                public static void displayInorder(Node root){
                    Node current = root;
                    if(current!=null){
                        displayInorder(current.left);
                System.out.print(" " + current.data);
                displayInorder(current.right);

            }
        }
        public static void main(String args[]){
            /*Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();*/
            Node root=null;
            /*while(T-->0){*/
               // int data=sc.nextInt();

            root=insert(root,3);
            root=insert(root,5);
            root=insert(root,2);
            root=insert(root,1);
            root=insert(root,4);
            root=insert(root,6);
            root=insert(root,7);

                //}
            int height=getHeight(root);
            System.out.println(height);
            displayInorder(root);
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

