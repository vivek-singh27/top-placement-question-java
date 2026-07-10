package workingWithNumber;

import java.util.Scanner;

public class maxiumumNumeberOfHandshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=(n*(n-1))/2;   //pnc formula
        System.out.println("maximum handshake for "+n +" people is : "+ ans);
    }
}
