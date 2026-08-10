package dp;

import java.util.Scanner;

public class houseRobberTwo {
    public static int max(int[]arr){
        int n=arr.length;
        return Math.max(maxrob(arr,0,n-2),maxrob(arr,1,n-1));
    }
    private static int maxrob(int[]arr,int start,int end){
        int n=arr.length;
        int []dp=new int[n+1];
        dp[start]=arr[start];
        dp[start+1]=Math.max(dp[start],dp[start+1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[end];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=max(arr);
        System.out.println(ans);
    }
}
