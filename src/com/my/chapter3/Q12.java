package com.my.chapter3;

/**
 * Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
 * An Invoice should include four pieces of information as instance variables - a part number, a ipart description, a
 * quantity of the item being purchased and a price per item. Your class should have a constructor that initializes
 * the four instance variables. Provide a set and a get method for each instance variable. In addition, provide a
 * method named getInvoiceAmount that calculates the invoice amount, then returns the amount as a double value.
 * If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be
 * set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice's capabilities.
 */
public class Q12 {
    public static void main(String[] args) {
        Invoice steakInvoice = new Invoice("Steak", "Dinner Steak", 2, 12.56);

        System.out.println("The invoice amount is " + steakInvoice.getInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice() { }

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0);
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}