package com.my.chapter4;

/**
 * Write an application that keeps displaying in the command window the multiples of the integer 2 -
 * namely, 2, 4, 8, 16, 32, and so on. Your loop should not terminate. What happens when you run this program?
 */
public class Q1 {
    public static void main(String[] args) {
        int number = 2;

        while(true) {
            System.out.println(number);
            number *= 2;
        }
    }
}
