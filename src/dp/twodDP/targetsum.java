package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class targetsum {
    public static int solve(int[]arr,int n,int[][]dp,int sum){
        if(n==0){
            if(sum==0)return 1;
            else return 0;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        int nottake=solve(arr,n-1,dp,sum);
        int take=0;
        if(arr[n-1]<=sum){
            take=solve(arr,n-1,dp,sum-arr[n-1]);
        }
        return dp[n][sum]=take+nottake;
    }
    public static int find(int[]arr,int target,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if((sum+target)%2!=0)return 0;
        if(sum<Math.abs(target))return 0;
        int reqsum=(sum+target)/2;
        int[][]dp=new int[n+1][reqsum+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(arr,n,dp,reqsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=find(arr,target,n);
        System.out.println(ans);
    }
}
