import java.util.Scanner;

public class Day4 {
 public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++)
        System.out.print("* ");
        System.out.println();
    }
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    for(int i=1;i<=p;i++){
        for(int j=1;j<=p;j++)
        System.out.print("* ");
        System.out.println();
    }
 }    
}
