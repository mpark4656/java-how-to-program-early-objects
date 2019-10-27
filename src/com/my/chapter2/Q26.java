package com.my.chapter2;
/*
    Write an application that reads two integers, determines whether the first is a
    multiple of the second and prints the result.
 */
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int firstValue, secondValue;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");

        firstValue = scanner.nextInt();
        secondValue = scanner.nextInt();

        System.out.printf("The first value is %s of the second value%n",
                (firstValue % secondValue == 0 ? "a multiple" : "not a multiple")
        );
    }
}
