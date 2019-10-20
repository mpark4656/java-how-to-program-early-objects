package com.my.chapter2;

// import Scanner from Java application programming interface
import java.util.Scanner;

public class E3 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input= new Scanner(System.in);

        // first number to add
        int firstNumber;
        // second number to add
        int secondNumber;
        // store the sum of first number and second number
        int sum;

        // prompt for first number
        System.out.print("Enter first integer: ");
        // read first number from user
        firstNumber = input.nextInt();

        // prompt for second number
        System.out.print("Enter second integer: ");
        // read second number from user
        secondNumber = input.nextInt();

        // add the two numbers and store in sum
        sum = firstNumber + secondNumber;

        // display the sum using formatted print
        System.out.printf("The sum of %d and %d is %d%n", firstNumber, secondNumber, sum);
    }
}
