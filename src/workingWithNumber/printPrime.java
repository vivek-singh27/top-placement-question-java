package workingWithNumber;

import java.util.Scanner;

public class printPrime {
    static boolean isPrime(int n){
        int count=0;
        if(n<2)return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
       return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter lower limit");
        int a= sc.nextInt();
        System.out.println("enter upper limit");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
