package Array;
import java.util.Arrays;
public class day13 {
    static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i+ " ");
        }
    }
    static boolean binarysearch(int[]arr,int n){
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n) return true;
            else {
            if(arr[mid]<n){
            i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        }
            return false;
        }
        public static void main(String[] args) {
            int[] arr={3,4,6,1,2,8,9,3};
            Arrays.sort(arr);
            printArr(arr);
            System.out.println();
            int n;
            System.out.println(binarysearch( arr, n=6));

        }
    }

