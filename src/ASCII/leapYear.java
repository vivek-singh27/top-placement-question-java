package ASCII;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("non-leap year");
        }
    }
}
