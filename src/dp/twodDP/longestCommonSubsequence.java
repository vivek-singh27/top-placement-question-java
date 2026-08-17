package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonSubsequence {
    public static int solve(String s1,String s2,int i,int j,int[][]dp){
        if(i==0 || j==0)return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1+solve(s1,s2,i-1,j-1,dp);
        }else{
           return dp[i][j]=Math.max(solve(s1,s2,i-1,j,dp),solve(s1,s2,i,j-1,dp));
        }


    }
    public static int longest(String s1,String s2){
        int i=s1.length();
        int j=s2.length();
        int[][]dp=new int[i+1][j+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return solve(s1,s2,i,j,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int ans=longest(s1,s2);
        System.out.println(ans);
    }
}
