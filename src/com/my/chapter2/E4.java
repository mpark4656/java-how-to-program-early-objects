package com.my.chapter2;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        System.out.print("Enter first integer: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second integer: ");
        secondNumber = input.nextInt();

        if(firstNumber == secondNumber) {
            System.out.printf("%d == %d%n", firstNumber, secondNumber);
        }

        if(firstNumber != secondNumber) {
            System.out.printf("%d != %d%n", firstNumber, secondNumber);
        }

        if(firstNumber > secondNumber) {
            System.out.printf("%d > %d%n", firstNumber, secondNumber);
        }

        if(firstNumber < secondNumber) {
            System.out.printf("%d < %d%n", firstNumber, secondNumber);
        }

        if(firstNumber <= secondNumber) {
            System.out.printf("%d <= %d%n", firstNumber, secondNumber);
        }

        if(firstNumber >= secondNumber) {
            System.out.printf("%d >= %d%n", firstNumber, secondNumber);
        }
    }
}
