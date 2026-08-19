package Array;

import java.util.*;

public class topKwords {
    public static List<String>top(String []words,int k){
        HashMap<String,Integer>map=new HashMap<>();
        for(String ele: words){
          map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{

            if(map.get(a).equals(map.get(b))){
                return b.compareTo(a);
            }

            return map.get(a)-map.get(b);
        });
        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Step 4: Store answer
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        int k=sc.nextInt();
        List<String> ans=top(words,k);
        System.out.println(ans);
    }
}
