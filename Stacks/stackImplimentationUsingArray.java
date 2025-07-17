package Stacks;

//import java.util.Stack;

public class stackImplimentationUsingArray {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(idx==arr.length){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int val=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return val;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }

        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();// 1 2 3 4 5
        st.push(6);
        System.out.println(st.size());//5
        st.peek();//5
        System.out.println(st.isFull());//true
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
