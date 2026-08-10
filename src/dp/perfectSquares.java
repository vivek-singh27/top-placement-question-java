package dp;

import java.util.Arrays;
import java.util.Scanner;

public class perfectSquares {
    public static int solve(int n){
        int []dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int count=1;
        while(count*count<=n){
            int sq=count*count;
            for(int i=sq;i<=n;i++){
                dp[i]=Math.min(dp[i-sq]+1,dp[i]);
            }
            count++;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=solve(n);
        System.out.println(ans);
    }
}
