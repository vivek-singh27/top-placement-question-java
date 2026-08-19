package Array;

import java.util.HashMap;
import java.util.Scanner;

public class majorityelement {
    public static int solve(int []arr,int n){
//        HashMap<Integer,Integer>map=new HashMap<>();
//
//        for(int ele:arr){
//            map.put(ele,map.getOrDefault(ele,0)+1);
//        }
//        for(int ele:map.keySet()){
//            if(map.get(ele) >n/2){
//                return ele;
//            }
//        }

        int candidate = 0;
        int count = 0;

        for (int ele : arr) {

            if (count == 0) {
                candidate = ele;
            }

            if (ele == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
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
