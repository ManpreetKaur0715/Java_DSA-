import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        //left facing triangle pattern printing problem
       int n=4;
       for(int i=1;i<=n;i++) 
       {
        for(int k=1;k<=(n-i);k++)
            System.out.print("  ");
        for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
       }
       //by taking input:
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=1;i<=t;i++) 
       {
        for(int k=1;k<=(t-i);k++)
            System.out.print("  ");
        for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
       }
    }
}
