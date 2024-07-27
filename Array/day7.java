package Array;

public class day7 {
    static void returnsum(int arr[], int a,int b){
        //if(a>b || a<0 ||b<0 || b>=arr.length)
       // return 0;
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
            System.out.println(sum);
            return;
        }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9,1,2,3,4,5};
        int a=3;
        int b=9;
        returnsum(arr,a,b);
    }
}