package com.my.chapter2;

/*
    Write an application that reas an integer and determines and prints whether it's odd or even.
 */

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        int value;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        value = scanner.nextInt();

        System.out.printf("The value %d is %s", value, (value % 2 == 0 ? "even" : "odd"));
    }
}
