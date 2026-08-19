package Array;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthsmallest {
    public static int smallest(int []arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr){
            pq.add(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=smallest(arr,k);
        System.out.println(ans);
    }
}
