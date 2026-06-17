package ASCII;

import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(int n){
        int rev=0;
        int original=n;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ispalindrome(n));
    }
}
