import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++)
                System.out.print(j+" ");
                System.out.println();
        }
    }
}
