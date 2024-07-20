package Week1;

import java.util.Scanner;

public class Day2 {
    //create a function to check a number n is prime or not.
    static boolean checkprime (int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
           return true;
            }

        public static void main(String[] args) {
            int n=13;
            System.out.println(checkprime(n));
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println(checkprime(a));
        }
    }

