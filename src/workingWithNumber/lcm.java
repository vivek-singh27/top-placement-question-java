package workingWithNumber;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        int lcm=(n1*n2)/hcf;
        System.out.println(lcm);;
    }
}
