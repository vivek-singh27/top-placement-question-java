package ASCII;

import java.util.Scanner;

public class FriendlyNumber {
    static int getDivisorSum(int n){
        int sum=0;
       for(int i=1;i<n;i++){
           if(n%i==0){
               sum+=i;
           }
       }
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int div1=getDivisorSum(n1);
        int div2=getDivisorSum(n2);
        if(n1/div1==n2/div2){
            System.out.println("friendly pair");
        }
        else{
            System.out.println("not a friendly pair");
        }
    }
}
