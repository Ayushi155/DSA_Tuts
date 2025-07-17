package Stacks;

import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+3346";
        String reversed = new StringBuilder(str).reverse().toString();
        Stack<Integer> val = new Stack<>();
//we can also traverse string backwards <---
// so we dont need to reverse the string

        for(int i=0;i<str.length();i++){
            char ch= reversed.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <= 57) val.push(ascii-48);
            else if(ch == '+' || ch=='-'|| ch=='*'||ch=='/'){
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }

}
