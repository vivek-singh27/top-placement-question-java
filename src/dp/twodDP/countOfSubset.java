package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class countOfSubset {
    public static int solve(int[]arr,int[][]dp,int n,int sum){
        if(n==0){
            if(sum==0)return 1;
            else return 0;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        int nottake=solve(arr,dp,n-1,sum);
        int take=0;
        if(arr[n-1]<=sum){
            take=solve(arr,dp,n-1,sum-arr[n-1]);
        }
            return dp[n][sum]=take+nottake;
    }
    public static int count(int[]arr,int sum,int n){
        int[][]dp=new int[n+1][sum+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(arr,dp,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        int ans=count(arr,sum,n);
        System.out.println(ans);
    }
}
