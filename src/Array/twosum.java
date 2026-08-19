package Array;

import java.util.Scanner;

public class twosum {
    public static int[] solve(int[]arr,int n,int target){
        int start=0;
        int end=n-1;
        while(start<end){
           int sum=arr[start]+arr[end];
           if(sum==target){
               return new int []{start+1,end+1};
           }
           else if(sum>target){
               end--;
           }else{
               start++;
           }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int []ans=solve(arr,n,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
