package Array;

import java.util.Scanner;

public class secondSmallest {
    public static int smallestarr(int arr[],int n){
        int smallest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int sec_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=smallest && arr[i]<sec_smallest){
                sec_smallest=arr[i];
            }
        }
        return sec_smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(smallestarr(arr,n));
    }
}
