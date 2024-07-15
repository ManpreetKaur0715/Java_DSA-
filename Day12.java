import java.util.Scanner;
public class Day12 {
  public static void main(String[] args) {
    //input
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    //output
    System.out.println("Value of a is:");
    System.out.println(a);
    System.out.println("Value of b is :");
    System.out.println(b);
    System.out.println("Arithmetic operators :");
    int A=a+b;
    int B=a-b;
    int C=a*b;
    int D=a/b;
    int E=a%b;
    int F=a++;
    int G=a--;
    int H=b++;
    int I=b--;
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    System.out.println(D);
    System.out.println(E);
    System.out.println(F);
    System.out.println(G);
    System.out.println(H);
    System.out.println(I);
    System.out.println("Assigtnment Operatos :");
    int J=sc.nextInt();
    System.out.println("Value of J is :");
    System.out.println(J);  
    J+=a;  
    System.out.println("Value of J after increementation :");
    System.out.println(J);
    System.out.println("Comparison Operators :");
    boolean K= a>b;
   System.out.println(K);
   boolean L =a<b;
   System.out.println(L);
   boolean M = a==b;
   System.out.println(M);
   boolean N = a!=b;
   System.out.println(N);
   boolean O = a<=b;
   System.out.println(O);
   boolean P = a>=b;
   System.out.println(P);
   sc.close();
  }
}
