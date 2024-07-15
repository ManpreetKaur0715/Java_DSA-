import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        //Q1: Take an integer n as input and print a * n times.
        // 5 : * * * * *
         int n=10;
         for(int i=1; i<=n;i++){
         System.out.print("* ");
         //System.out.println();
         }
        Scanner sc =new Scanner(System.in);
        int v=sc.nextInt();
        for(int i=1;i<=v;i++){
        System.out.println("* ");
        }
    }
}
