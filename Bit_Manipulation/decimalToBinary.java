package Bit_Manipulation;
import java.util.Scanner;
public class decimalToBinary {
    public static int conversion(int n){
        String remainder = "";
        while(n>0){
            int rem = n%2;
            remainder+=String.valueOf(rem);
            n/=2;
        }
        String reversed = new StringBuilder(remainder).reverse().toString();
        int res = Integer.parseInt(reversed);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(conversion(n));
        sc.close();
    }
}
