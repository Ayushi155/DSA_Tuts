package LinkedList;

public class cycleInLL {
    //detect loop in LL
    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
    }

    public static boolean hasCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }

        Node h= head;
        Node t=head;

        while(h != null && h.next != null){
            h=h.next.next;
            t=t.next;
            if(h==t){
                return true;
            }
        }
        return false;

    }

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    // public static int lengthOfCycle(Node head){
    //     Node slow = head;
    //     Node fast = head;
    //     int size=0;
    //     int count=0;
    //     while(slow!=null){
    //         size++;
    //         slow=slow.next;
    //     }
    //     slow=head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if (slow == fast) {
    //             slow = head;
    //             while (slow != fast) {
    //                 slow = slow.next;
    //                 fast = fast.next;
    //                 count++;
    //             }
    //             return size-count;
    //         }
    //     }
    //     return 0;
    // }


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
        h.next = c;
        if(hasCycle(a))
            System.out.println("yes there is a cycle");
        else
            System.out.println("No cycle");
        
        Node cycleNode = detectCycle(a);
        if (cycleNode!=null) {
            System.out.println("The cycle starts at the node "+ cycleNode.data);
        }
        else{
            System.out.println("No cycle found");
        }
        // int length = lengthOfCycle(a);
        // System.out.println(length);
    }
}
