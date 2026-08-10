package dp;

import java.util.Scanner;

public class longestIncreasingSubsequnne {
    public static int solve(int[]arr,int n){
        int[]dp=new int[n];
        int ans=1;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            ans=Math.max(ans,dp[i]);
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
        int ans=solve(arr,n);
        System.out.println(ans);
    }
}
