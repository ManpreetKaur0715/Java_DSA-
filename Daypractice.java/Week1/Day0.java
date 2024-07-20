package Week1;
public class Day0 {
//create a function named swap: swap 2 values.
//swap (int a,int b)
static void swap(int a, int b){
    //code
    int temp=a;
    a=b;
    b=temp;
    //System.out.print(a+" "+b);
}
    public static void main(String[] args) { 
        int a=10, b=15;
      swap(a,b); 
      System.out.print(a+" "+b);

    }
    
}
