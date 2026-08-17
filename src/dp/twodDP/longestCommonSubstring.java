package dp.twodDP;

import java.util.Scanner;

public class longestCommonSubstring {
    public static int longest(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][]dp=new int[n+1][m+1];
        if(n==0 || m==0)return 0;
        int max=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int ans=longest(s1,s2);
        System.out.println(ans);
    }
}
