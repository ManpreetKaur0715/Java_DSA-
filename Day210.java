import java.util.Scanner;
import java.lang.*;
public class Day210 {
   public static void main(String[] args) {
      //question 7 pattern printing problem
    int n=5;
    for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++)
    if(i==1 || i==n || j==1 || j==n)
    System.out.print("* ");
   else
    System.out.print("  ");
   System.out.println();
    }

 //by taking input from user
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
for(int i=1;i<=r;i++){
   for(int j=1;j<=r;j++)
   if(i==1 || i==r || j==1 || j==r)
   System.out.print("* ");
  else
   System.out.print("  ");
  System.out.println();
   }
}
}   
