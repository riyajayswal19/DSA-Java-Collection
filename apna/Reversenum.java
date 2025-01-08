package apna;

import java.util.Scanner;

public class Reversenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int reversedNumber = 0;
        int lastDigit;

        do {
            lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        } while (num > 0);
        System.out.println("Reverse number is: " + reversedNumber);
    }
}
