package dp.twodDP;

import java.util.Scanner;

public class longestRepeatingSubsequnce {
    public static int solve(String s){
        int n=s.length();
        int[][]dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
                     dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ans=solve(s);
        System.out.println(ans);
    }
}
