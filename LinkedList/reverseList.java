package LinkedList;

public class reverseList {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
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

    //now reverse the list in real i.e. reverse the connection
    //for this using recursion we have to follow 1. base case 2. call 3. work pattern for this we have to find base case and for that below algo will work
    //1->2->4->5->6->null  now 1 will call the reverse func again to ki age ki list mujhe reverse kr ke do baki ek mai khud kr luga  i.e. 1->2<-4<-5<-6
    //again for this firstly 2 will make a call to reverse its age ki list i.e. 2->4<-5<-6
    //again the same for 4 i.e. 4->5<-6
    //again 5 will make a call but 6 is pointing to null 6->null so this will not execute and the func will return the node i.e. 6 and then 5 and 6 will reverse their connection by itself
    //hence we got our base case when temp will point to null

    public static Node reverseLL(Node head){
        if (head.next==null) {
            return head;
        }                       //base case
        Node newHead = reverseLL(head.next);
        head.next.next=head;    //work
        head.next=null;
        return newHead;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        display(a);
        dispalayUsingRecursion(a);
        System.out.println();
        dispalayReverseUsingRecursion(a);
        System.out.println();
        Node r = reverseLL(a);
        display(r);
    }
}
