import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        //inverted left facing triangle pattern printing problem
        int n=7;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++)
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        for(int i=g;i>=1;i--){
            for(int k=1;k<=(g-i);k++)
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}
