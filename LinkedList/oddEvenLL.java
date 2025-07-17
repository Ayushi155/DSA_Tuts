package LinkedList;

public class oddEvenLL {
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }
    //with using extra space
    //this code is modifying list according to node values
    public static Node oddEvenList(Node head){
        Node curr = head;
        Node dummyOdd = new Node(0);
        Node dummyEven = new Node(0);
        Node o = dummyOdd;
        Node e = dummyEven;
    
        while (curr != null) {
            Node nextNode = curr.next; // Save the next node
            curr.next = null;          // Disconnect current node from original list
    
            if (curr.data % 2 == 0) {
                e.next = curr;
                e = e.next;
            } else {
                o.next = curr;
                o = o.next;
            }
    
            curr = nextNode; // Move to saved next node
        }
    
        o.next = dummyEven.next; // Connect end of odd list to start of even list
        return dummyOdd.next;
    }

    //without using extra space
    //this is modifying according to index value
    public static Node oddEvenList2(Node head){
        // Node curr=head;
        Node odd = head;
        Node even=head.next;
        Node oddPtr=head;
        Node evenPtr = head.next;
        while(even.next!=null && even.next.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenPtr;
        return oddPtr;
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
        g.next = h;
        h.next = null;
        // Node show = oddEvenList(a);
        // display(show);
        display(a);
        Node show2 = oddEvenList2(a);
        display(show2);
    }

}
