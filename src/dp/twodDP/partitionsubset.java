package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class partitionsubset {
    public static boolean solve(int[]arr,int[][]dp,int sum,int n){
        if(n==0) return false;
        if(sum==0)return true;
        if(dp[n][sum]!=-1){
            return dp[n][sum]==1;
        }
        boolean nottake=solve(arr,dp,sum,n-1);
        boolean take=false;
        if(arr[n-1]<=sum){
            take=solve(arr,dp,sum-arr[n-1],n-1);
        }
        dp[n][sum]=(take||nottake)?1:0;
        return take||nottake;
    }
    public static boolean issubset(int[]arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2!=0)return false;
        int target=sum/2;
        int[][]dp=new int[n+1][target+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(arr,dp,target,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(issubset(arr,n)){
            System.out.println("it is a equal partiton subset");
        }
        else{
            System.out.println("it is not a equal partition subset");
        }
    }
}
