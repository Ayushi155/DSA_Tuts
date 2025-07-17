package LinkedList;

import LinkedList.implementationOfDLL.Node.doublyLinkedList;

public class implementationOfDLL {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

        public static class doublyLinkedList {
            Node head=null;
            Node tail=null;
            

            int size=0;
            
            void insertAtHead(int data){
                Node temp=new Node(data);
                if(head==null){
                    head=tail=temp;
                }
                else{
                    temp.next=head;
                    head.prev=temp;
                    head=temp;
                }
                size++;
            }
            void insertAtTail(int data){
                Node temp=new Node(data);
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                if(head==null){
                    head=tail=temp;
                }
                else{
                    curr.next=temp;
                    temp.prev=curr;
                    tail=temp;
                }
                size++;
            }

            void insertAtIndex(int idx,int data){
                Node temp = new Node(data);
                if(idx == size){
                    insertAtTail(data);  // ✅ Better to reuse logic
                    return;
                }
                
                else if(idx==0){
                    temp.next=head;
                    head=temp;//here we can also write
                    //insertAtHead(val);
                    size++;
                    return;
                }
                else{
                    Node curr=head;
                    for(int i=0;i<idx-1;i++){
                        curr=curr.next;
                    }
                    temp.next=curr.next;
                    curr.next.prev=temp;
                    curr.next=temp;
                    temp.prev=curr;
                }
                size++;
            }
            Node getNodeAtIndex(int index) {
                if (index < 0 || index >= size) return null;
                Node temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp;
            }
            void deleteAtIndex(int idx) {
                if (idx < 0 || idx >= size) {
                    System.out.println("Invalid index");
                    return;
                }
            
                if (idx == 0) {
                    if (head == tail) {
                        head = tail = null;
                    } else {
                        head = head.next;
                        head.prev = null;
                    }
                    size--;
                    return;
                }
            
                Node curr = head;
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }
            
                Node nodeToDelete = curr.next;
            
                if (nodeToDelete == tail) {
                    tail = curr;
                    curr.next = null;
                } else {
                    curr.next = nodeToDelete.next;
                    nodeToDelete.next.prev = curr;
                }
            
                size--;
            }
            
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
            void displayUsingNode(Node random) {
                Node temp = random;
                while (temp.prev != null) {
                    temp = temp.prev;
                }
                display();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        doublyLinkedList DLL = new doublyLinkedList();
        DLL.insertAtHead(10);
        // DLL.display();
        // System.out.println("Head value is " + DLL.head.val);
        // System.out.println("Tail value is " + DLL.tail.val);
        DLL.insertAtHead(5);
        DLL.insertAtHead(1);
        // DLL.display();
        // System.out.println("Head value is " + DLL.head.val);
        // System.out.println("Tail value is " + DLL.tail.val);
        DLL.insertAtTail(20);
        DLL.insertAtTail(30);
        // DLL.display();
        // System.out.println("Tail value is " + DLL.tail.val);
        DLL.insertAtIndex(2, 100);
        // DLL.display();
        // DLL.displayUsingNode(DLL.tail);
        // Node randomNode = DLL.getNodeAtIndex(2);  // for example, node at index 2
        // DLL.displayUsingNode(randomNode);
        // Node randomNode = DLL.getNodeAtIndex(0);  // for example, node at index 2
        // DLL.displayUsingNode(randomNode);
        // System.out.println(DLL.size);
        DLL.deleteAtIndex(2);
        DLL.display();
        
    }

}
