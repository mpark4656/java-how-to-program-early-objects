package com.my.chapter2;

/*
    Write an application that reads five integers and determines and prints the largest and
    smallest integers in the group. Use only the programming techniques you learned in this chapter.
 */

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int smallest, largest;

        System.out.print("Enter 5 integers: ");

        numbers[0] = scanner.nextInt();
        smallest = numbers[0];
        largest = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            if(numbers[i] > largest) largest = numbers[i];
            if(numbers[i] < smallest) smallest = numbers[i];
        }

        System.out.printf("Smallest: %d%nLargest: %d%n", smallest, largest);
    }
}
