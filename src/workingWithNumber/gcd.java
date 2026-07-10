package workingWithNumber;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=n1;
        int b=n2;
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}//both hcf and gcd are same
//this appraoch is called euclid algo