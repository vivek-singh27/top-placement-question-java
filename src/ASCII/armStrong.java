package ASCII;

import java.util.Scanner;

public class armStrong {
    public static boolean isarmstrong(int n) {

        int original = n;

        // Count digits
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum += (int)Math.pow(digit, digits);

            temp /= 10;
        }

        return sum == original;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

         isarmstrong(n);
        if(isarmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
