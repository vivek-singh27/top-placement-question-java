package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class subsetsum {
    public static boolean ans(int[]arr,int n,int sum,int[][]dp){
        if(n==0)return false;
       if(sum==0)return true;
       if(dp[n][sum]!=-1){
           return dp[n][sum]==1;
       }
       //not take
        boolean nottake=ans(arr,n-1,sum,dp);
        //take
        boolean take=false;
        if(arr[n-1]<=sum){
            take=ans(arr,n-1,sum-arr[n-1],dp);
        }
        dp[n][sum]=(take||nottake)?1:0;
        return take||nottake;

    }
    public static boolean issubset(int[]arr,int n,int target){
        int[][]dp=new int[n+1][target+1];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return ans(arr,n,target,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(issubset(arr,n,target)){
            System.out.println("it is a subset");
        }
        else{
            System.out.println("not a subset");
        }
    }
}
