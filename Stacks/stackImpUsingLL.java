package Stacks;

public class stackImpUsingLL {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack {
        private Node head=null;
        private int size=0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if (head==null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if (head==null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        // void display(){
        //     Node temp= head;
        //     if(temp==null){
        //         return;
        //     }
        //     display(temp.next);
        //     System.out.println(temp.val);
        // }
        void displayRecursively(Node h){
            if(h==null){
                return;
            }
            displayRecursively(h.next);
            System.out.print(h.val + " ");
        }
        void display(){
            displayRecursively(head);
            System.out.println();
        }
        void displayRev(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.display();
        System.out.println(st.isEmpty());
        //System.out.println(st.isFull());
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();// 1 2 3 4 5
        //st.push(6);
        System.out.println(st.size());//5
        System.out.println(st.peek());//5
        //System.out.println(st.isFull());//true
        st.pop();
        st.display();//1 2 3 4
        st.pop();
        st.display();//1 2 3
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.size());//
        System.out.println(st.isEmpty());
        st.pop();
    }
}
