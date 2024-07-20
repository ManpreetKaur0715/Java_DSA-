package Week1;

import java.util.Scanner;

public class Day4 {
    // Return number of digits present in a number n. n=1234 return: 4
    static int givenum(int n ) {
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=76436;
        System.out.println(givenum(n));
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(givenum(a));
    }
}
