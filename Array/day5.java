package Array;

public class day5 {
   // Return the sum of your arr: 1,2,3,4,5
   static void returnsum(int[] arr){
    //for each loop
    int sum=0;
    for(int i:arr){
        //System.out.println(i+" ");
        sum+=i;
    }
        System.out.println(sum);
        return;
    }

   public static void main(String[] args) {
    int[] arr={3,5,7,9,1,2,4,6,8,10};
    returnsum(arr);
   }
}
