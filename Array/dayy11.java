package Array;

public class dayy11 {
    static void swaparray(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseusingswap(int[] arr){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            swaparray(arr,i,j);
        }
    }
       public void printArr(int[] arr){
            for(int i:arr){
                System.out.println(i+" ");
            }
        }
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,5,5};
      swaparray();
       
    }
}
