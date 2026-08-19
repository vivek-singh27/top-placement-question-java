package Array;

import java.util.HashMap;
import java.util.Scanner;

public class prefuxsumK {
    public static int solve(int[]arr,int n,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int prefixsum=0;
        int count=0;
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=solve(arr,n,k);
        System.out.println(ans);
    }
}
