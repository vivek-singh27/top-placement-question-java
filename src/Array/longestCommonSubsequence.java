package Array;

import java.util.HashSet;
import java.util.Scanner;

public class longestCommonSubsequence {
    public static int solve(int[]arr,int n){
        int max=1;
        HashSet<Integer>set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        for(int ele:arr){
            if(!set.contains(ele-1)){
                int curr=ele;
                int length=1;
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                    max=Math.max(max,length);
                }
            }
        }
        return max;
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
