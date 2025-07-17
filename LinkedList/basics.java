package LinkedList;

import LinkedList.basics.Node.linkList;

public class basics {

    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data=data;
        }
        //creating a LinkedList class with name linkList as LinkedList class is already available in java so we are taking diff name
        public static class linkList {
            Node head=null;
            Node tail=null;

            int size=0;

            //creating diff functions inside class {here we are not using public static bar-bar coz it is already in this func}
            void insertAtEnd(int val){
                Node temp=new Node(val);
                if(head == null){
                    head=temp;
                }
                else{
                    tail.next=temp;
                }
                tail=temp;
                size++;
                display();
            }

            void insertAtstart(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=tail=temp;//here we can alsp replace this line with
                    //insertAtEnd(val); //coz for empty LL both are doing same task
                    //return;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
                size++;
                display();
            }

            void insertAtIndex(int idx, int val){
                Node temp=new Node(val);
                Node curr=head;
                if(idx == size){
                    insertAtEnd(val);  // ✅ Better to reuse logic
                    return;
                }
                
                else if(idx==0){
                    temp.next=head;
                    head=temp;//here we can also write
                    //insertAtHead(val);
                    size++;
                    return;
                }
                for(int i=0;i<idx-1;i++){
                    curr=curr.next;
                }
                temp.next=curr.next;
                curr.next=temp;
                size++;
                display();
            }
            int getAt(int idx){
                if(idx<0 || idx>+size){
                    System.out.println("wrong input");
                    return-1;
                }
                Node curr=head;
                for(int i=0;i<idx;i++){
                    curr=curr.next;
                }
                return curr.data;
            }
            int nthNodeFromEnd(int n){
                Node curr=head;
                for(int i=0;i<size-n-1;i++){
                    curr=curr.next;
                }
                return curr.data;
            }
            // void deleteNode(){

            // }

            void display(){
                Node a=head;
                while(a != null){
                    System.out.print(a.data + " ");
                    a=a.next;
                }
                System.out.println();
            }

            //dispalay using recursion
        }
        
    }


    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.insertAtEnd(10);
        //ll.display();
        ll.insertAtEnd(20);
        //ll.display();
        ll.insertAtEnd(25);
        //ll.display();
        //System.out.println(head.data);
        //System.out.println(tail.data);

        ll.insertAtstart(5);
        //ll.display();

        ll.insertAtIndex(2, 9);
        //ll.display();
        ll.insertAtIndex(5, 15);
        //ll.display();
        //System.out.println(ll.tail.data);
        //ll.insertAtIndex(8, 35);//error
        //ll.display();
        ll.insertAtIndex(0, 1);
        ll.display();
        //System.out.println(ll.head.data);
        //System.out.println(ll.getAt(4));
        System.out.println(ll.nthNodeFromEnd(2));
        System.out.println(ll.size);
        
    }
}