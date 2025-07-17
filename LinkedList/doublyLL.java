package LinkedList;

public class doublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node tail;
        
        Node(int val) {
            this.val = val;
        }
    }
    
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayUsingNode(Node random) {
        Node temp = random;
        //move temp to backwards until temp.prev == null i.e. to the head node (coz head is the onlu node whoes .prev is null and tail is the only node whoes .next is null)
        while (temp.prev != null) {
            temp = temp.prev;
        }
        //after this operation our temp is at head node
        display(temp);
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(19);
        Node e = new Node(13);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        
        //doublyLL.display(a); // Correct way to call the static method display from the enclosing class
        //doublyLL.displayReverse(e);
        doublyLL.displayUsingNode(d);



    }
}

