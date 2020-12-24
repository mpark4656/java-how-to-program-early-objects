package com.my.chapter4;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Drivers are concerned with the mileage their automobiles get. Once driver has kept track of several
 * trips by recording the miles driven and gallons used for each tankful. Develop a Java application that
 * will input the miles driven and gallons used (both as integers) for each trip. The program should calculate
 * and display the miles per gallon obtained for each trips up to this point. All averaging calculations should
 * produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the data from
 * the user.
 */

public class Q17 {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}

class Application {
    private final ArrayList<Trip> trips = new ArrayList<>();

    private void displayPrompt() {
        System.out.println();
        System.out.println("1. Enter data.");
        System.out.println("2. Display data.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
    }

    private void displayChoiceError() {
        System.err.println("Invalid Choice");
    }

    private void getData(Scanner scanner) {
        System.out.print("Enter the miles traveled in this trip: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter the gallons used in this trip: ");
        double gallons = scanner.nextDouble();
        trips.add(new Trip(miles, gallons));
    }

    private void displayData() {
        if(trips.isEmpty()) {
            System.err.println("No data to display");
            return;
        }

        int counter = 1;
        double totalMileage = 0;

        System.out.println();
        for(Trip trip : trips) {
            System.out.println(
                "Trip " + counter++
            );
            System.out.println(
                "Miles: " + trip.getMiles()
            );
            System.out.println(
                "Gallons: " + trip.getGallons()
            );
            System.out.printf(
                "Mileage: %.2f%n", trip.getMilesPerGallon()
            );
            System.out.println();
            totalMileage += trip.getMilesPerGallon();
        }
        System.out.printf("Average Mileage: %.2f%n", totalMileage / trips.size());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice;

        while(!exit) {
            displayPrompt();
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    getData(scanner);
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    displayChoiceError();
            }
        }
    }
}

class Trip {
    private double miles;
    private double gallons;

    public Trip(double miles, double gallons) {
        setMiles(miles);
        setGallons(gallons);
    }

    public double getMilesPerGallon() {
        return miles / gallons;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }
}