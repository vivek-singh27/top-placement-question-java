package workingWithNumber;

import java.util.Scanner;

public class octalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int octal=sc.nextInt();
        int n=0;
        int decimal=0;
        while(octal>0){
            int temp=octal%10;
            decimal+=temp*Math.pow(8,n);
            octal/=10;
            n++;
        }
        System.out.println(decimal);
    }
}
