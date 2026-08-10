package dp;

import java.util.Scanner;

public class mincostClimbingStair {
    public static int min(int[]arr){
        int n=arr.length;
        int[]dp=new int[n+2];
        dp[n]=0;
        dp[n+1]=0;
        for(int i=n-1;i>=0;i--){
            dp[i]=arr[i]+Math.min(dp[i+1],dp[i+ 2]);
        }
        return Math.min(dp[0],dp[1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=min(arr);
        System.out.println(ans);
    }
}
