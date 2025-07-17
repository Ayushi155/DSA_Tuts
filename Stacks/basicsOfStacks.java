package Stacks;

//import java.util.ArrayList;  // we havent imported it, is it imported by itself
import java.util.Stack;

public class basicsOfStacks {
    public static void displayReverseUsingRecusion(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        System.out.print(top + " x  ");
        displayReverseUsingRecusion(st);
        st.push(top);
    }

    public static void displayUsingRecusion(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        displayReverseUsingRecusion(st);
        System.out.print(top+ " ");
        st.push(top);
    }

    public static void main(String[] args) {
        //int[] arr = new int[5];   //like we initialize an array
        //ArrayList<Integer> arr1 = new ArrayList<>(); //like we initialize an array list 
        //similarly w initialize stacks
        //while initializing arraylist a self import option is written on top as java.util.ArrayList
        //similary for using builtin stack a self import in imported
        Stack<Integer> st = new Stack<>();
        //System.out.println(st); // will print empty stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); //will print whole stack
        // System.out.println(st.peek()); //prints the top element in stack
        // st.pop(); // delete last inserted element i.e. the top element
        // System.out.println(st);
        // System.out.println("Size is: " + st.size());

        //copy the elements of this stack into another in reverse order

        // Stack<Integer> st2 = new Stack<>();
        // while(st.size()>0){
        //     // int x = st.peek();
        //     // st2.push(x);
        //     // st.pop();
        //     st2.push(st.pop());
        // }
        // System.out.println(st);
        // System.out.println(st2);

        // //insert an element in the stack at given index
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // Stack<Integer> st3 = new Stack<>();

        // while(st.size()>2){
        //     st3.push(st.pop());
        // }
        // st.push(10);
        // while (st3.size()>0) {
        //     st.push(st3.pop());
        // }
        // System.out.println(st);
        displayReverseUsingRecusion(st);
        System.out.println();
        displayUsingRecusion(st);

    }

}
