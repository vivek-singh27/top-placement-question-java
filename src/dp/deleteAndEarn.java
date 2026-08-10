package dp;

import java.util.Scanner;

public class deleteAndEarn {
    public static int earn(int[]arr){
        int n=arr.length;

        int max=0;
        for(int ele:arr){
            max=Math.max(ele,max);
        }
        int[]points=new int[max+1];
        for(int ele:arr){
            points[ele]+=ele;
        }
        int[]dp=new int[max+1];
        dp[0]=points[0];
        dp[1]=Math.max(dp[0],dp[1]);
        for(int i=2;i<=max;i++){
            dp[i]=Math.max(dp[i-1],points[i]+dp[i-2]);
        }
        return dp[max];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=earn(arr);
        System.out.println(ans);
    }
}
