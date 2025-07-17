package LinkedList;

public class findMiddleOfLL {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    public static Node middleOfLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //implement this part if for even no. of node in LL you want middle+1 as middle i.e. right middle
        if(fast.next != null){
            return slow.next;
        }
        return slow;
    }
    public static void deleteMiddle(Node head){
        if(head==null || head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
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
        Node h = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        //g.next = null;
        g.next = h;
        h.next = null;
        display(a);
        Node middle=middleOfLL(a);
        System.out.println(middle.data);
        deleteMiddle(a);
        display(a);
    }

}
