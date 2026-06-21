package ASCII;

import java.util.Scanner;

public class fibonacciUpToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int next=0;
        //here printing a and b
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            next=a+b;
            a=b;
            b=next;
            System.out.print(next +" ");
        }
    }
}
