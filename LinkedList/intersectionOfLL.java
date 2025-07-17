package LinkedList;

public class intersectionOfLL {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    public static Node findIntersection(Node head1, Node head2){
        Node h1 = head1;
        Node h2 = head2;
        int m = 0;
        int n = 0;
        while(h1!=null){
            m++;
            h1=h1.next;
        }
        while(h2!=null){
            n++;
            h2=h2.next;
        }
        h1=head1;
        h2=head2;
        if(m>n){
                for(int i=0;i<m-n;i++){
                    h1=h1.next;
                }
                while(h1!=h2){
                    h1=h1.next;
                    h2=h2.next;
                }
            }
        else{
            for(int i=0;i<n-m;i++){
                h2=h2.next;
            }
            while(h1!=h2){
                h1=h1.next;
                h2=h2.next;
            }
        }
        return h1;
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

        // Creating second list
        Node x = new Node(10);
        Node y = new Node(11);
        x.next = y;
        y.next = e;  // Intersection starts at node 'e'

        Node intersection = findIntersection(a, x);
        if(intersection != null)
            System.out.println("Intersection at node with data: " + intersection.data);
        else
            System.out.println("No intersection found.");
        
    }

}
