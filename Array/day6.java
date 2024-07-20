package Array;

public class day6 {
    // Print an array in reverse order: 5,4,3,2,1
    static void reversearr(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
        }
        public static void main(String[] args) {
            int[] arr={3,8,7,5,4,1,2,9};
            reversearr(arr);
        }
    }
