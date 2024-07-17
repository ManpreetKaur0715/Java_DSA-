import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        //question 8 pattern printing problem
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            if(i==j || (i+j)==6)
            System.out.print("*  ");
            else
            System.out.print("    ");
            System.out.println();
        }
        //by taking input from user(not a perfect x)
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for(int i=1;i<=h;i++){
            for(int j=1;j<=h;j++)
            if(i==j || (i+j)==6)
            System.out.print("*  ");
            else
            System.out.print("    ");
            System.out.println();
        }
    }
    
}
