package Trees;

public class demo {
    public static void main(String[] args) {
        int a=10;
        int b=7;
        for(int i=1;i<=5;i++){
            a=a+i+b;
            while (a>6) {
                a=a+b;
                b=b-1;
                a=a-1;
            }
            System.err.println(a);
        }
    }
}
