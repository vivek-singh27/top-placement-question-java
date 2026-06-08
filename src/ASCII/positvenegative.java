package ASCII;

import java.util.Scanner;

public class positvenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }
}
