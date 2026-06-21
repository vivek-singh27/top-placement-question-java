package ASCII;

import java.util.Scanner;

public class perfectNumber {
    static boolean isPerfect(int n){
       int sum=0;
       int original=n;
       for(int i=1;i<n;i++){
           if(n%i==0){
               sum=sum+i;
           }
       }
       if(sum==original)return true;
       return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(isPerfect(n));
    }
}
//sum of factors of n exluding itself is equal to n