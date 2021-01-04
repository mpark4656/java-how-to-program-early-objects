package com.my.chapter4;
/*
 * A large company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of
 * their gross sales for that week. For example, a salesperson who sells $5000 worth of merchandise in a week
 * receives $200 plus 9% of $5000, or a total of $650. You've been supplied with a list of the items sold by each
 * salesperson. The values of these items are as follows:
 *
 * Item     Value
 * 1        239.99
 * 2        129.75
 * 3        99.95
 * 4        350.89
 *
 * Develop a Java application that inputs one salesperson's items sold for the last week and calculates and displays
 * that salesperson's earnings. There is no limit to the number of items that can be sold.
 */
import java.util.HashMap;

class Salesperson {
    private final int id;
    private final HashMap<Integer, Integer> itemsSold = new HashMap<>();

    public Salesperson(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Integer getItemCount(int itemId) {
        if(itemsSold.containsKey(itemId)) {
            return itemsSold.get(itemId);
        }
        return 0;
    }

    public void addItemSold(int itemId, int count) {
        itemsSold.put(itemId, count);
    }

    public double getTotalSales(HashMap<Integer, Double> itemCatalog) {
        double total = 0;
        for(int itemKey : itemsSold.keySet()) {
            total += itemsSold.get(itemKey) * itemCatalog.get(itemKey);
        }
        return total;
    }
}

public class Q19 {
    private static final double COMMISSION = 9;
    private static final double BASE = 200;
    private static final HashMap<Integer, Double> itemCatalog = new HashMap<> ();

    public static void init() {
        itemCatalog.put(1, 239.99);
        itemCatalog.put(2, 129.75);
        itemCatalog.put(3, 99.95);
        itemCatalog.put(4, 350.89);
    }

    public static void displayDetails(Salesperson salesperson) {
        System.out.println("The salesperson #" + salesperson.getId() + " has sold");
        System.out.println("Item 1: " + salesperson.getItemCount(1));
        System.out.println("Item 2: " + salesperson.getItemCount(2));
        System.out.println("Item 3: " + salesperson.getItemCount(3));
        System.out.println("Item 4: " + salesperson.getItemCount(4));
        System.out.println("The total merchandise sale is $" + salesperson.getTotalSales(itemCatalog));
        System.out.println(
                "The total wage is " +
                Math.round(
                    (BASE + salesperson.getTotalSales(itemCatalog) * COMMISSION / 100) * 100
                ) / 100.00
        );
        System.out.println();
    }

    public static void main(String[] args) {
        init();

        Salesperson salesPersonOne = new Salesperson(1);
        Salesperson salesPersonTwo = new Salesperson(2);
        Salesperson salesPersonThree = new Salesperson(3);

        salesPersonOne.addItemSold(1, 11);
        salesPersonOne.addItemSold(2, 3);
        salesPersonOne.addItemSold(3, 0);
        salesPersonOne.addItemSold(4, 5);

        salesPersonTwo.addItemSold(1, 0);
        salesPersonTwo.addItemSold(2, 10);
        salesPersonTwo.addItemSold(3, 15);
        salesPersonTwo.addItemSold(4, 6);

        salesPersonThree.addItemSold(1, 25);
        salesPersonThree.addItemSold(2, 15);
        salesPersonThree.addItemSold(3, 5);
        salesPersonThree.addItemSold(4, 9);

        displayDetails(salesPersonOne);
        displayDetails(salesPersonTwo);
        displayDetails(salesPersonThree);
    }
}
