public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println(1);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*System.out.println(2);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*System.out.println(3);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*System.out.println(4);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }*/

        /*System.out.println(5);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*System.out.println(6);
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*System.out.println(7);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=10-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*System.out.println(8);
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int j=1;j<=(5-i)+1;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1;j<=i-5;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }*/

        System.out.println(9);
        for(int i=1;i<10;i++){
            if(i<=5){
                for(int j=1;j<=5-i+1;j++){
                    System.out.print("*");
                }
                for(int j=0;j<5;j++){
                    System.out.print(" ");
                }
            }
            else{
                for(int j=i;j<=i-5+1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
