package Array;

import java.util.Scanner;

public class kadaneSum {
    public static int kadane(int []arr,int n){
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxsum=Math.max(sum,maxsum);
            if(sum<0)sum=0;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=kadane(arr,n);
        System.out.println(ans);
    }
}
