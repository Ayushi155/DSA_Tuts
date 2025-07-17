package LinkedList;

public class mergeTwoSortedLL {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    public static Node MergeTwoList(Node head1, Node head2){
        Node head3 = new Node(0);
        Node temp = head3;
        Node h1=head1;
        Node h2=head2;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
            }
            else{
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;
            }
        }
        if(h1==null){
            temp.next=h2;
        }
        else{
            temp.next=h1;
        }
        return head3.next;
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
        Node e = new Node(1);
        Node f = new Node(3);
        Node g = new Node(4);
        Node h = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;

        Node show = MergeTwoList(a,e);
        display(show);
    }

}
