package LinkedList;

public class deleteNode {
    //in this question we have to delete a node when we are not given the access to the head node
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    public static void deleteNodeWithoutHead(Node node){
        if (node == null || node.next == null) {
            System.out.println("Error: Node should not be null or the last one");
            return;
        }
        Node curr=node;
        curr.data=curr.next.data;
        curr.next=curr.next.next;
    }
    public static void display(Node head){
        Node a=head;
        while(a != null){
            System.out.print(a.data + " ");
            a=a.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(8);
        Node g = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        deleteNodeWithoutHead(g);
        display(a);
    }
}
