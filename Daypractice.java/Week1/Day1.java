package Week1;

import java.util.Scanner;

public class Day1 {
    //create a function to print first n natural numbers.
    static void nat(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i+" ");
        } 
    }
    public static void main(String[] args) {
        int n=10;
        nat(n);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        nat(a);
    }
}
