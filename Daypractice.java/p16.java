public class p16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=4){
                System.out.print( n+ " ");
               n--;
            }
            else{
                System.out.print("* ");
            }
            
        }
        n+=4;
            System.out.println();
            
        }  
    }
}
