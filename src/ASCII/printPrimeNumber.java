package ASCII;

import java.util.Scanner;

public class printPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower limit");
        int lower=sc.nextInt();
        System.out.println("Enter upper limit");
        int upper=sc.nextInt();
        for(int i=lower;i<=upper;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
     static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
         int count = 0;
         for (int i = 2; i < n; i++) {
             if (n % i == 0) {
                 return false;
             }
         }

         return true;
     }
}
