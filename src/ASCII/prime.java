package ASCII;

import java.util.Scanner;

public class prime {
    public static boolean checkprime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==2)return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        checkprime(n);
        System.out.println(checkprime(n));
    }
}
