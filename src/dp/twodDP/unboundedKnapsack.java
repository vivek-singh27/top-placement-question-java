package dp.twodDP;

import java.util.Arrays;
import java.util.Scanner;

public class unboundedKnapsack {
    public static int recc(int n,int v,int[]weight,int[]value,int[][]dp){
        if(n==0 || v==0){
            return 0;
        }
        if(dp[n][v]!=-1){
            return dp[n][v];
        }
        //if weight allows
        if(weight[n-1]<=v){
            int take = value[n - 1]
                    + recc(n , v - weight[n - 1], weight, value, dp);
            int notTake = recc(n - 1, v, weight, value, dp);
            dp[n][v] = Math.max(take, notTake);  //not take
        }else{
            dp[n][v]=recc(n-1,v,weight,value,dp);  //skip
        }
        return dp[n][v];
    }
    public static int rec(int n,int v,int[]weight,int[]value){
        int n1=value.length;
        int[][]dp=new int[n1+1][v+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        return recc(n,v,weight,value,dp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        System.out.println("enter the length of weight array");
        int n1=sc.nextInt();
        int []weight=new int[n1];
        System.out.println("enter the length of value array");
        int n2=sc.nextInt();
        int[]value=new int[n2];
        for(int i=0;i<n1;i++){
            weight[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            value[i]=sc.nextInt();
        }
        int ans=rec(n,v,weight,value);
        System.out.println(ans);
    }
}
