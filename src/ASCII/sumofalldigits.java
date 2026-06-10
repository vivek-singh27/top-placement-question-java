package ASCII;

import java.util.Scanner;

public class sumofalldigits {
    public static int digit(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int ans=digit(n);
        System.out.println(ans);
    }
}
