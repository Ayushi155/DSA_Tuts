package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xyz {
    // public static void \u006d\u0061\u0069\u006e(String[] args){
    //     System.out.println("hello world");
    // } printing a program without using the main function
    public static void main(String[] args) {
        String s1="greeksforgreeks";
        String s2="greefgive";
        String res="";

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    continue;
                }
                else{
                    res+=s1.charAt(i);
                }
            }
        }

        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==s2.charAt(i)){
                    continue;
                }
                else{
                    res+=s2.charAt(i);
                }
            }
            List<Character> charList = new ArrayList<>();
            for (char c : res.toCharArray()) {
                charList.add(c);
            }
            Collections.sort(charList);
            System.out.println(charList);
        }
        // int num=15;
        // System.out.println(num&1); // to check even odd
        // Integer a = 123;
        // Integer b = 123;
        // System.out.println((a==b));
        // if(System.out.printf("Hello") != null) {} // printing without using semicolon
        // int g = 3;
        // //System.out.println(++g*8);
        // g++;
        // g++;
        // System.out.println(g);
    }
}
