package Array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargestinteger {
    public static String largest(String[] s, int k){
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            if(a.length()!=b.length()){
                return a.length()-b.length();
            }
            return a.compareTo(b);
        });
       for(String ele :s){
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
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int k= sc.nextInt();
        String ans=largest(s,k);
        System.out.println(ans);
    }
}
