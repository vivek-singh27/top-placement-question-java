package ASCII;

import java.util.Scanner;

public class perfectSquare {
    static boolean isPerfectSquare(int n){
        if(n>=0){
            int sr=(int)Math.sqrt(n);
            return ((sr*sr)==n);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if (isPerfectSquare(n))
            System.out.print("True");
        else
            System.out.print("False");
    }
}
