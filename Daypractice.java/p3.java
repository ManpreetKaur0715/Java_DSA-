public class p3 {
    public static void main(String[] args) {
        //first triangle
       int n=5;
       for (int i=n;i>=1;i--){
       for(int k=1;k<=(n-i);k++)
       System.out.print("  "); 
    for(int j=1;j<=(i-1) && j<=n;j++)
    System.out.print("* ");
    System.out.println();
    //second triangle
    //for(int j=1;j<=(i-1)&&j<=n;j++)
    //System.out.println("* ");
    }
}
}