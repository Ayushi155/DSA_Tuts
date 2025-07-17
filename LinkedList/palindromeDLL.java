package LinkedList;

public class palindromeDLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node tail;
        
        Node(int val) {
            this.val = val;
        }
    }

        public static boolean isPalindrome(Node node){
            Node h=node;
            Node t=node;

            // we are using this to bring h to head if the user give any random node as input
            while (h.prev != null) {
                h = h.prev;
            }

            // for pointing t to tail
            while(t.next!=null){
                t=t.next;
            }

            //by making our code work correctly for random node as input we are correctly using the features of DLL

            while(h != null && t != null && h!=t){
                if(h.val!=t.val){
                    return false;
                }
                h=h.next;
                t=t.prev;
            }
            return true;
        }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        if(isPalindrome(c)){
            System.out.println(" Is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }
        
    }

}
