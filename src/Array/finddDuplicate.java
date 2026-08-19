package Array;

import java.util.Scanner;

public class finddDuplicate {
    public static int solve(int[]arr,int n){
        int slow = arr[0];
        int fast = arr[0];
        // Phase 1: Find meeting point
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        // Phase 2: Find entrance of cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[]args){

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
