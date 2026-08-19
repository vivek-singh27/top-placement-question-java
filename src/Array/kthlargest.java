package Array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargest {
    public static int largest(int[]arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=largest(arr,k);
        System.out.println(ans);
    }
}
