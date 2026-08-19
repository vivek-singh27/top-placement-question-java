package Array;

import java.util.Scanner;

public class missingNumber {
    public static int solve(int[]arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=i;
        }
        for(int ele:arr){
            xor^=ele;
        }
        return xor;
        //can also be done using total sum -arrsum
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=solve(arr,n);
        System.out.println(ans);
    }
}
