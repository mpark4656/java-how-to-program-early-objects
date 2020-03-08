package com.my.chapter3;

/**
 * Create a class called Employee that includes three instance variables - a first name, a lst name, and a monthly salary.
 * Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance
 * variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest that
 * demonstrates class Employee's capabilities. Create two Employee objects that display each object's yearly salary.
 * Then give each Employee a 10% raise and display each Employee's yearly salary again.
 */

public class Q13 {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Michael", "Park", 4000.00);
        employeeOne.raise(20);
        System.out.println(employeeOne.getYearlySalary());
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0) this.monthlySalary = monthlySalary;
    }

    public void raise(double percent) {
        monthlySalary *= percent / 100 + 1;
    }
}
