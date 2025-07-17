package Stacks;

import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+3346";
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch= str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii <= 57) val.push(Character.toString(ch));
            else if(ch == '+' || ch=='-'|| ch=='*'||ch=='/'){
                String v1 = val.pop();
                String v2 = val.pop();
                if (ch == '+') val.push(v1 + v2 + Character.toString(ch));
                if (ch == '-') val.push(v1 + v2 + Character.toString(ch));
                if (ch == '*') val.push(v1 + v2 + Character.toString(ch));
                if (ch == '/') val.push(v1 + v2 + Character.toString(ch));
            }
        }
//             if (Character.isDigit(ch)) {           // clearer than ASCII range
//     val.push(String.valueOf(ch));
// } else {                               // ch is an operator
//     String v1 = val.pop();             // left operand
//     String v2 = val.pop();             // right operand
//     val.push(v1 + v2 + ch);            // form postfix
// }

//         }
        System.out.println(val.peek());
    }

}
