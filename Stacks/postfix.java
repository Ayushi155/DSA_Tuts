package Stacks;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String str = "9-(3+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <= 57) val.push(Character.toString(ch));
            else if (op.isEmpty()) op.push(ch);
            else if(ch == '(') op.push(ch);
            else{
                if(ch == '+' || ch == '-'){
                    if (op.peek() == '(') {
                        op.push(ch);
                    } else {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    if (op.peek() == '+') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '-') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '*') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '/') val.push(v1 + v2 + Character.toString(op.peek()));
                    op.pop();
                    op.push(ch);
                    }
                }
                else if (ch == '*' || ch == '/') {
                    if(op.peek() == '*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '/') val.push(v1 + v2 + Character.toString(op.peek()));
                        op.pop();
                        
                    }
                    op.push(ch);
                }
                else if(ch==')'){
                    while( !op.isEmpty() && op.peek()!='('){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        if (op.peek() == '+') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '-') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '*') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '/') val.push(v1 + v2 + Character.toString(op.peek()));
                        op.pop();
                    }
                    op.pop();
                }
                else op.push(ch);
            }
            
        }
        while (!op.isEmpty() && val.size()>1) {
            String v2 = val.pop();
            String v1 = val.pop();
            if (op.peek() == '+') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '-') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '*') val.push(v1 + v2 + Character.toString(op.peek()));
                    if (op.peek() == '/') val.push(v1 + v2 + Character.toString(op.peek()));
            op.pop();
        }
        System.out.println(val.peek());
    }
}
