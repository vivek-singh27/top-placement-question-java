package Array;

import java.util.Scanner;

public class secondlargest {
    public static int second(int[]arr,int n){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>largest){
               second=largest;
               largest=arr[i];
           }else if(arr[i]>second && arr[i]!=largest){
               second=arr[i];
           }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=second(arr,n);
        System.out.println(ans);
    }
}
