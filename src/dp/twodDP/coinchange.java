package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class coinchange {
    public static int solve(int[]arr,int n,int[][]dp,int sum){
        if(n==0){
            if(sum==0)return 1;
            else return 0;
        }
        if(dp[n][sum]!=-1) {
            return dp[n][sum];
        }
            int nottake=solve(arr,n-1,dp,sum);
            int take=0;
            if(arr[n-1]<=sum){
                take=solve(arr,n,dp,sum-arr[n-1]);
            }
            return dp[n][sum]=take+nottake;

    }
    public static  int coin(int[]arr,int n,int amount){
        int[][]dp=new int[n+1][amount+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(arr,n,dp,amount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int amount=sc.nextInt();
        int ans=coin(arr,n,amount);
        System.out.println(ans);
    }
}
