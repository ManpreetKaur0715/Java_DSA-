public class p14 {
    public static void main(String[] args) {
        //question29 pattern printing problem
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
                }
            for(int j=1;j<=i   ;j++){
                if(j==1){
                    System.out.print(" ");
                System.out.print(i+" ");
                }
                else{
                    System.out.print("0");
                    System.out.print(" ");
                }
            }
        
        for(int j=1;j<=i-1;j++){
            if(j==i-1){
          System.out.print(i+" ");
          System.out.print(" ");
            }
            else{
                System.out.print("0");
                System.out.print(" ");
            }
        }
        System.out.println();
       }    
    }
}
