package ASCII;

import java.util.Scanner;

public class automorphicNumber {
    static int isAutomorphic(int n){
        int sq=n*n;
        while(n>0){
            if(n%10 !=sq%10)return 0;
            sq=sq/10;
            n=n/10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sq=n*n;
        if(isAutomorphic(n)==1){
            System.out.println("num "+n+" square " + sq+ " - automorphic number");
        }
       else{
            System.out.println("not a automorphic number");
        }
    }
}
