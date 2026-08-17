package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class ribbonCutting {
    public static int solve(int n,int a,int b,int c,int[]dp){
        if(n==0)return 0;
        if(n < 0) return -1000000;
        if(dp[n]!=-1){
            return dp[n];
        }
        int cutA=1+solve(n-a,a,b,c, dp);
        int cutB=1+solve(n-b,a,b,c,dp);
        int cutC=1+solve(n-c,a,b,c,dp);
        return dp[n]=Math.max(cutA,Math.max(cutB,cutC));
    }
    public static int ribbon(int n,int a,int b,int c){
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,a,b,c,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=ribbon(n,a,b,c);
        System.out.println(ans);
    }
}
