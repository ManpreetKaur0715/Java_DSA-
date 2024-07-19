public class p17 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==i){
                System.out.print("0");
            }
            else{
                System.out.print((n-i)+ " ");
            }
        }
            for(int j=1;j<=i-1;j++){
                if(j%2!=0){
                    System.out.print(" ");
                    System.out.print(  (n-i)+" ");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
