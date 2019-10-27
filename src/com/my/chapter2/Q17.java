package com.my.chapter2;

/*
    Write an application that inputs three integers from the user and displays the sum, average,
    product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15
    [Note: The calculation of the average in this exercise should result in an integer representation
    of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333...]
 */

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        int firstValue, secondValue, thirdValue, sum, product, min, max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");

        firstValue = scanner.nextInt();
        secondValue = scanner.nextInt();
        thirdValue = scanner.nextInt();

        sum = firstValue + secondValue + thirdValue;
        product = firstValue * secondValue * thirdValue;
        min = Math.min(Math.min(firstValue, secondValue), thirdValue);
        max = Math.max(Math.max(firstValue, secondValue), thirdValue);

        System.out.printf(
                "Sum: %d%nAverage: %d%nProduct: %d%nSmallest: %d%nLargest: %d%n",
                sum , sum / 3 , product, min, max
        );
    }
}
