package Bit_Manipulation;

import java.util.Scanner;

public class binaryToDecimal {
    public static int conversion(String n){
        String reversed = new StringBuilder(n).reverse().toString();
        int value=0;
        for(int i=0;i<reversed.length();i++){
            if(reversed.charAt(i)=='1'){
                value+=Math.pow(2, i);
            }
        }
        return value;
    }
    //without using the power function
    // in this we are increasing the value of p every time by double(x2) but adding it to the value only when it is 1
    //  p = 1 2 4 8 16 32 after each iteration
    //val = 1 0 0 1 1 // add only when it is 1
    public static int convert(String n){
        int p=1;
        int value=0;
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)=='1'){
                value+=p;
            }
            p*=2;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String n=sc.next();
        System.out.println(conversion(n));
        System.out.println(convert(n));
        sc.close();
    }
}
