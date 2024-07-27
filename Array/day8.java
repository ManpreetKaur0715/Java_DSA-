package Array;

public class day8 {
    static void printArr(int[] arr){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    //Reverse the array.(Very Important)
    static void reverse(int[] arr){
     int[] temp=new int[arr.length];
     for(int i=0;i<arr.length;i++){
        temp[i]=arr[arr.length-1-i];
        reverse(temp);
        arr=temp;

     }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        reverse(arr);
        printArr(arr);
        
    }
}
