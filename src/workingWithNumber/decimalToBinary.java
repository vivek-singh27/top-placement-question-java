package workingWithNumber;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number");
        int decimal=sc.nextInt();
        String binary="";
        while(decimal>0){
            int temp=decimal%2;
            binary=temp+binary;
            decimal/=2;
        }
        System.out.println(binary);
    }
}
