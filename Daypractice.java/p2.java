public class p2 {
    public static void main(String[] args) {
        //question 9 pattern printing problem
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++)
            System.out.print("  ");
            for(int j=1; j<=i ;j++)
            System.out.print("* ");
            //System.out.println();
        }
            //second triangle
        for( int j=1; (j<=(i-1) && j<=n);j++){
        System.out.print("* ");
        //System.out.println();
        }   
    }
    

