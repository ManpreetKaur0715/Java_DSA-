package Array;

public class day12 {
    static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
            System.out.println();
        }
    }
    static boolean linearsearch(int arr[],int n){
        for(int i:arr){
            if(i==n) return true;
            return false;
        }
    }
    
}
