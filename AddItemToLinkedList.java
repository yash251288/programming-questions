import java.io.*;
import java.util.*;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    class AddItemToLinkedList {
        static Node tail = null;

        public static  Node insert(Node head,int data) {
            Node newNode= new Node(data);
               if(head==null)
               {
                   head = newNode;
                   tail = newNode;
               }

               else
               {
                   tail.next = newNode;
                   tail =newNode;
                    /*if we want to add element in front
                    newNode.next=head;
                    head =newNode;*/
               }
                return head;
        }

        public static void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }

}
