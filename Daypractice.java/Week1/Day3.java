package Week1;

import java.util.Scanner;

public class Day3 {
  // Return the inverse of a number n.n=0001549 return: 9451
    static int reverse(int x){
       int n=0;
       while(x>0){
         n=n*10+x%10;
         x=x/10;
       }
       return n;


    }
    public static void main(String[] args) {
        int x=6785;
        System.out.println(reverse(x));
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(reverse(a));
    }
}
