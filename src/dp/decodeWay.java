package dp;

import java.util.Arrays;
import java.util.Scanner;

public class decodeWay {
    public static int solve(String s,int[]dp,int i){
        int n=s.length();
        if(i==n)return 1;
        if(dp[i]!=-1){
            return dp[i];
        }
        int one=solve(s,dp,i+1);
        int two=0;
        if(i+1<n){
            int num=Integer.parseInt(s.substring(i,i+2));
            if(num>=10 && num<=26){
                two=solve(s,dp,i+2);
            }
        }
        dp[i]=one+two;
        return dp[i];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=solve(s,dp,0);
        System.out.println(ans);
    }
}
