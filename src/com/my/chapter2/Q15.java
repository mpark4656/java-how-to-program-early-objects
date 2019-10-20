package com.my.chapter2;
/*
 * Write an application that asks the user to enter two integers,
 * obtains them from the user and prints their sum, product, difference, and quotient.
 */
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers separated by a space: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.printf(
                "Sum: %d%n" +
                "Product: %d%n" +
                "Difference: %d%n" +
                "Quotient: %s%n",
                num1 + num2,
                num1 * num2,
                num1 - num2,
                (num2 != 0 ? (num1 / 2) : "indivisible")
        );
    }
}
