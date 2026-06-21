package ASCII;

import java.util.Scanner;

public class harshdNumber {
    static int isHarshd(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        if(n%sum==0)return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(isHarshd(n)==1){
            System.out.println("it is a harshd number");
        }else{
            System.out.println("it is not a harshd number");
        }
    }
}
