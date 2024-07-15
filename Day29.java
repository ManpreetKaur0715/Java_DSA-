import java.util.Scanner;

public class Day29 {
        public static void main(String[] args) {
            //question 6 pattern printing problem
            int n=5;
            for(int i=n;i>=1;i--){
                for(int k=1;k<=(n-i);k++)
                System.out.print("    ");
                for(int j=1;j<=i;j++)
                System.out.print("* ");
                System.out.println();
            }
            //by taking input from user
            Scanner sc=new Scanner(System.in);
            int e=sc.nextInt();
            for(int i=e;i>=1;i--){
                for(int k=1;k<=(e-i);k++)
                System.out.print("    ");
                for(int j=1;j<=i;j++)
                System.out.print("* ");
                System.out.println();
            }
        }
    }

