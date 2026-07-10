package workingWithNumber;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println("enter value of p");
        int p=sc.nextInt();
        int fact1=1,fact2=1;
        for(int i=1;i<=n;i++){
            fact1=fact1*i;
        }
        int number=n-fact1;
        for(int i=number;i>=1;i--){
            fact2=fact2*i;
        }
        int per=fact1/fact2;
        System.out.println(per);
    }
}
