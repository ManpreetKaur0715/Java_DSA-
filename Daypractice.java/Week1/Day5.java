package Week1;

public class Day5 {
    // Check if a number is armstrong or not.
    static int givenum(int n ) {
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
        static boolean checkarm( int n){
            int d=givenum(n);
            int sum=0;
            int temp=n;
            while(n!=0){
                sum+=Math.pow((n%10),d);
                n/=10;
            }
            return(sum==temp);
        }
    public static void main(String[] args) {
        int n=371;
        System.out.println(checkarm(n));
    }
}
