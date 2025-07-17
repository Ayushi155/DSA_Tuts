package Resursion;

// resursion follow stack principle i.e. lifo last in first out


// for example in this function let n =3 the main method is calling pN func but in side pn func another func is being call hence for temp period it is stored in stack as lest say f1
//now pN func makes a call for n-1 (i.e. n =2 ) in same func so it is stored in stack as let say f2 as our cursour in able to move to print statement hence is not printing instead is being stored in stack
//again same thing happen for n=1 but when this is being called the will print 1 and the return so the code below the return statement will not print 
//now everything that is stored in the stack will come out in lifo form that is firstly f2 will print i.e. n=2  as the f2 part was now when it will came out of stack the line below this statement in the function will execute
//the line below f2 was print statement hence print statement will execute
//and then f1 will print i.e. n=3 

public class resurionProblems {
    public static void printNUmber(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }                           //base case
        printNUmber(n-1);           //call
        System.out.print(n + " ");  //work
    }
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int factorialOfN(int n){
        if(n==1){
            return 1;
        }
        return n*factorialOfN(n-1);

    }
    public static int sumOfNNumbers(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        if(n==1 || n==0){
            return n;
        }
        return n + sumOfNNumbers(n-1);
    }
    public static int sumOfDigits(int n){
        if (n<=0) {
            return 0;
        }
        //int temp = n/10;
        //return n%10 + sumOfDigits(temp);
        return n%10 + sumOfDigits(n/10);
    }
    public static int countOfDigits(int n){
        if (n<=0) {
            return 0;
        }
        return 1 + countOfDigits(n/10);
    }
    public static int pow(int p,int q){
        if(q==0){
            return 1; //2^0=1
        }
        return p*pow(p,q-1);
    }
    //but this is taking o(q) time we can reduce it
    //for example if we have 2^4 we can write it as 2^2 * 2^2 and again 2^2 as 2^1 * 2^1 if we have q as even
    //now for q as odd 2^5 as 2 * 2^2 * 2^2
    // this will reduce the time complexity to o(log q)

    public static int pow2(int p, int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){//even
            return pow2(p, q/2) * pow2(p,q/2);
        }
        return pow2(p, q/2) * pow2(p,q/2) * p;
    }

    public static void table(int n,int i){
        if(i==0){
            return;
        }
        table(n, i-1);
        System.out.println(n + " x " + i + " = " + n*i);
    }
    public static int gcdOfTwoNum(int a, int b){
        if(b==0){
            return a;
        }
        return gcdOfTwoNum(b, a%b);
    }

    //WAP to print sum on n num but with alternative signs i.e. for n=5 ans = +1-2+3-4+5 = 3
    public static int sumWithAltSign(int n){
        if (n==0) {
            return 0;
        }
        sumWithAltSign(n-1);
        if (n%2==1) {
            return sumWithAltSign(n-1)+n;
        }
        return sumWithAltSign(n-1)-n;
    }
    // public static int printPrimeNumber(int n){
    //     if (n < 1) {
    //         throw new IllegalArgumentException("Input must be a positive integer.");
    //     }
    //     if(n==1){
    //         return 1;
    //     }
    //     printPrimeNumber(n-1);
    //     if(n)

    // }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number: ");
        // int n=sc.nextInt();
        // printNUmber(n);
        // System.out.println();

        // System.out.println("Fibonacci sequence up to " + n + ":");
        // for (int i = 0; i <= n; i++) {
        //     System.out.print(fib(i) + " ");
        // }
        // int a = sumOfNNumbers(5);
        // System.out.println("Sum is: " + a);
        // int n = factorialOfN(5);
        // System.out.println("Factorial of given num is: " + n);
        // int b = sumOfDigits(0);
        // System.out.println("Sum of digits: " + b);
        // int c = countOfDigits(1234);
        // System.out.println("Total num of digits is: " + c);
        // int d = pow(2, 4);
        // System.out.println(d);
        // int e = pow2(2, 4);
        // System.out.println(e);
        //table(5, 5);
        // int g = sumWithAltSign(4);
        // System.out.println(g);
        int h = gcdOfTwoNum(32, 12);
        System.out.println(h);
    }
}
