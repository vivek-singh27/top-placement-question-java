package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class topKelement {
    public static  int[] topk(int[]arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:arr){
           map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int ele:map.keySet()){
            pq.add(ele);
        }
        int[]ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] ans = topk(arr, k);

        System.out.print(Arrays.toString(ans));
    }
}
