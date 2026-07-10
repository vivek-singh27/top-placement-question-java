package workingWithNumber;

import java.util.Scanner;

public class hexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next().toUpperCase();

        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);

            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }

            decimal += value * Math.pow(16, power);
            power++;
        }

        System.out.println("Decimal = " + decimal);
    }
}