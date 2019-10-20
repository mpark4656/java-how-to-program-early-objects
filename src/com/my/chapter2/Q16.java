package com.my.chapter2;
/*
 *  Write an application that asks the user to enter two integers,
 *  obtains them from the user and displays the larger number followed by the words "is larger".
 *  If the numbers are equal, print the message "These numbers are equal".
 */

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers separated by a space: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.printf("%d is larger%n", num1);
        }

        if(num2 > num1) {
            System.out.printf("%d is larger%n", num2);
        }

        if(num2 == num1) {
            System.out.printf("These numbers are equal%n");
        }
    }
}
