package workingWithNumber;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number");
        int binary=sc.nextInt();
        int decimal=0;
        int n=0;
        while(binary>0){
            int temp=binary%10;
            decimal+=temp*Math.pow(2,n);
            binary/=10;
            n++;
        }
        System.out.println(decimal);

    }
}
//input=100
//output=4