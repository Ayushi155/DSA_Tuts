package LinkedList;

public class removeNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    public static Node nthNodeFromLast(Node head, int n){
        Node curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<size-n;i++){
            curr=curr.next;
        }
        return curr;

    }
    //two pointer method for fining the nth node from last
    public static Node twoPointerMethod(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    //the same teo pointer approch can also be used in removing of node
    public static void removeNthNodeFromTheEnd(Node head, int n){
        Node curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<size-n-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return;
    }
    public static void display(Node head){
        Node a=head;
        while(a != null){
            System.out.print(a.data + " ");
            a=a.next;
        }
        System.out.println( );
    }
    public static void dispalayUsingRecursion(Node head){
        if (head==null) {
            return;
        }                                   //base case
        System.out.print(head.data+ " ");   //work
        dispalayUsingRecursion(head.next);  //call
    }
    // Note that using this list is not reversed it is only displayed reversed
    public static void dispalayReverseUsingRecursion(Node head){
        if (head==null) {
            return;
        }                                           //base case
        dispalayReverseUsingRecursion(head.next);   //call
        System.out.print(head.data+ " ");           //work
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

        display(a);
        System.out.println();
        Node temp = nthNodeFromLast(a, 3);
        System.out.println(temp.data);
        Node temp2 = twoPointerMethod(a, 3);
        System.out.println(temp2.data);
        removeNthNodeFromTheEnd(a, 8);
        display(a);
    }

}
