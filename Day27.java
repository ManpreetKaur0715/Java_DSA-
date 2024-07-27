import java.util.Scanner;

public class Day27 {
   public static void main(String[] args) {
    //inverted right facing triangle pattern printing problem
    int n=6;
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
    }
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    for(int i=r;i>=1;i--){
        for(int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
        sc.close();
    }
   } 
}
