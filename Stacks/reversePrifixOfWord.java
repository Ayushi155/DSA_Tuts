package Stacks;

import java.util.Stack;

public class reversePrifixOfWord {
    public static String reversePrefix(String word, char ch) {
        int n = word.length();
        Stack<Character> st = new Stack<>();
        int idx = 0;
        if(word.indexOf(ch)==-1){
            return word;
        }
        while (idx < n) {
            if (word.charAt(idx) != ch) {
                st.push(word.charAt(idx));
                idx++;
            } else {
                st.push(word.charAt(idx));
                idx++;
                break;
            }
        }

        String res = "";
        while (!st.isEmpty()) {
            char a = st.pop();  // Use char here
            res += a;  // Append the character
        }

        while (idx < n) {
            char b = word.charAt(idx);  // Use char here
            res += b;  // Append the character
            idx++;  // Increment idx to move through the remaining word
        }

        return res;
    }
    public static void main(String[] args) {
        String word = "wxyz";
        char ch = 'd';
        String res = reversePrefix(word,ch);
        System.out.println(res);
    }
}
