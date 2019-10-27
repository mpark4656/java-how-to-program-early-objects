package com.my.chapter2;
/*
    Write an application that inputs from the user the radius of a circle as an integer and prints
    the circle's diameter, circumference, and area using the floating-point value for pi.
    Do not store the results of each calculation in a variable.
    Rather, specify each calculation as the value that will be output in a System.out.printf statement.
 */

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        int radius = scanner.nextInt();

        System.out.printf(
                "Diameter: %d%nCircumference: %f%nArea: %f%n",
                radius * 2,
                radius * 2 * Math.PI,
                radius * radius * Math.PI
        );
    }
}
