package ASCII;

import java.util.Scanner;

public class strongNumber {
    static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    static boolean isStrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+fact(digit);
            n=n/10;
        }
        if(sum==original)return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(isStrong(n));
    }
}
//strong number is defined as the sum of factrioal is equal to the original n