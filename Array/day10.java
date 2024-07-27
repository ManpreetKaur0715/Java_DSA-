package Array;

public class day10 {
    //create a swap function to swap two values inside an array.
    static void swap(int[] arr,int i,int j){
       //for(int a=0;a<arr.length;a++){
            int c=arr[i];
            arr[i]=arr[j];
           arr[j]=c;
            System.out.println(arr[i]+" "+arr[j]);
       }
           // System.out.println(arr[a]);

    public static void main(String[] args) {
        {
            int[] arr={1,2,3,4,5,6,7,8,9};
            int i=6;
            int j=8;

            swap(arr,i,j);
            //System.out.println(arr[j]+" "+arr[i]);
        }
    }
}
