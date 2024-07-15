import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        //Right facing triangle 
        int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
       } 
        
       Scanner sc=new Scanner(System.in);
       int q=sc.nextInt();
       for(int i=1;i<=q;i++){
        for(int j=1;j<=i;j++)
        System.out.print("* ");
        System.out.println();
       } 
       sc.close();
    }
}
