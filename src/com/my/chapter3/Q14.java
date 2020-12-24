package com.my.chapter3;

/**
 * Create a class called Date that includes three instance variables - a month (type int),
 * a day (type int) and a year (type int). Provide a constructor that initializes the three
 * instance variables and assumes that the values provided are correct. Provide a set and a get
 * method for each instance variable. Provide a method displayDate that displays the month, day and
 * year separated by forward slashes (/). Write a test app named DateTest that demonstrates class
 * Date's capabilities.
 */
public class Q14 {
    public static void main(String[] args) {
        Date myBirthDate = new Date(9, 10, 1989);
        System.out.println(myBirthDate.displayDate());
    }
}

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
}