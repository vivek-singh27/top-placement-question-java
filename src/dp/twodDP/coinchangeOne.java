package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class coinchangeOne {

    public static int solve(int[]arr,int n,int[][]dp,int sum){
        if(sum == 0) {
            return 0;
        }
        if(n == 0) {
            return 1000000;
        }
        if(dp[n][sum] != -1) {
            return dp[n][sum];
        }
        int nottake = solve(arr, n-1, dp, sum);
        int take = 1000000;
        if(arr[n-1] <= sum) {
            take = 1 + solve(arr, n, dp, sum-arr[n-1]);
        }
        return dp[n][sum] = Math.min(take, nottake);
    }
    public static  int coin(int[]arr,int n,int amount){
        int[][]dp=new int[n+1][amount+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        int ans = solve(arr, n, dp, amount);
        if(ans == 1000000) {
            return -1;
        }

        return ans;
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
