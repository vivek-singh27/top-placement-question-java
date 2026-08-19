package Array;

import java.util.Scanner;

public class kthslidingMaximumSum {
    public static int solve(int []arr,int n,int k){
        int maxsum=0;
        int sum=0;
        int i=0;
        for(int j=0;j<k;j++){
            sum+=arr[j];
        }
        maxsum=sum;
        for(int j=k;j<n;j++){
            sum=sum-arr[i]+arr[j];
            i++;
            maxsum=Math.max(maxsum,sum);
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
        int k=sc.nextInt();
        int ans=solve(arr,n,k);
        System.out.println(ans);
    }
}
