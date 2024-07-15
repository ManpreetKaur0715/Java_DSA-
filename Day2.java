import java.util.Scanner;
public class Day2 {
    public static void main(String[] args) {
          //print all natural numbers upto 10
        //by while loop
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            //change statement
            i++;
        }
            
        //print all natural numbers upto 10 sarting from i
        //by while loop
        
        Scanner sc = new Scanner(System.in);
        int j= sc.nextInt();
        while(j<=10)
        {
            System.out.println(j);
            //change statement
            j++;
        }
            
            int p;
            for(p=1;p<=10;p++){
              System.out.println(p); 
            }
              //for(int i=sc.nextInt();j=10; i<10 || j<6 && i+j=10 && j!=7; i++; j--)
              for(int q=sc.nextInt(); q<=10;q++){
                System.out.println(q);
              }
              sc.close();
    }
}
