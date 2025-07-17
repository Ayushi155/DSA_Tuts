package LinkedList;

public class twoSumDLL {
    //Given a sorted DLL find two nodes in DLL whoes sum is equal to the target
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node tail;
        
        Node(int val) {
            this.val = val;
        }
    }

    public static void twoSum(Node node,int target){
        Node h=node;
        Node t=node;
        //move h to head node
        while (h.prev!=null) {
            h=h.prev;
        }
        // Move t to the last node
        while (t.next != null) {
            t = t.next;
        }
        while (h != null && t != null && h != t && t.next != h) {
            int sum = h.val + t.val;
            if (sum == target) {
                System.out.println("First Node is " + h.val + ", Second Node is " + t.val);
                return; // or use `break` if you want only one pair
            } else if (sum > target) {
                t = t.prev;
            } else {
                h = h.next;
            }
        }
    
        System.out.println("No pair found");
    }

    public static void allPairsWithtwoSum(Node node, int target) {
        Node h = node;
        Node t = node;
        //move h to head node
        while (h.prev!=null) {
            h=h.prev;
        }
        // Move t to the last node
        while (t.next != null) {
            t = t.next;
        }
    
        boolean found = false;
    
        while (h != null && t != null && h != t && t.next != h) {
            int sum = h.val + t.val;
    
            if (sum == target) {
                System.out.println("First Node is " + h.val + ", Second Node is " + t.val);
                found = true;
                h = h.next;
                t = t.prev;
            } else if (sum > target) {
                t = t.prev;
            } else {
                h = h.next;
            }
        }
    
        if (!found) {
            System.out.println("No pair found");
        }
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
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;
        
        twoSum(c, 7);
        allPairsWithtwoSum(d, 7);
    }


}
