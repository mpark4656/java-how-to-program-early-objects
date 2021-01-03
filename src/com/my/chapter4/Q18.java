package com.my.chapter4;
import java.util.HashMap;

/**
 * Develop a Java application that determines whether any of several department store customers has exceeded
 * the credit limit on a charge account. For each customer, the following facts are available:
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer's account this month
 * e) allowed credit limit
 *
 * The program should input all these facts as integers, calculate the new balance
 * (= beginning balance + charges - credits), display the new balance and determine whether the new balance
 * exceeds the customer's credit limit. For those customers whose credit limit is exceeded, the program should
 * display the message "Credit limit exceeded".
 */
public class Q18 {
    public static void main(String[] args) {
        AccountApplication app = new AccountApplication();

        CustomerAccount accountOne = app.createAccount(12345);
        accountOne.setInitBalance(1000);
        accountOne.setCharges(6000);
        accountOne.setCredits(500);
        accountOne.setCreditLimit(5000);

        CustomerAccount accountTwo = app.createAccount(23456);
        accountTwo.setInitBalance(1000);
        accountTwo.setCharges(6000);
        accountTwo.setCredits(500);
        accountTwo.setCreditLimit(8000);

        System.out.println(app.getAllAccountDetails());
    }
}

class CustomerAccount {
    private int accountNumber;
    private int initBalance;
    private int creditLimit;
    private int credits;
    private int charges;

    public CustomerAccount() {}

    public int getAccountNumber() {
        return accountNumber;
    }

    public CustomerAccount(int accountNumber) {
        setAccountNumber(accountNumber);
    }

    public CustomerAccount(
            int accountNumber,
            int initBalance,
            int creditLimit,
            int credits,
            int charges
    ) {
        setAccountNumber(accountNumber);
        setInitBalance(initBalance);
        setCreditLimit(creditLimit);
        setCredits(credits);
        setCharges(charges);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getInitBalance() {
        return initBalance;
    }

    public void setInitBalance(int balance) {
        this.initBalance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public int calculateNewBalance() {
        return initBalance + charges - credits;
    }

    @Override
    public String toString() {
        String details = "";
        int newBalance = calculateNewBalance();

        details += "Account Number: " + getAccountNumber();
        details += "\nAccount Beginning Balance: " + getInitBalance();
        details += "\nAll Charges: " + getCharges();
        details += "\nApplied Credits: " + getCredits();
        details += "\nCredit Limit: " + getCreditLimit();
        details += "\nNew Balance: " + newBalance;
        if(newBalance > creditLimit) details += "\nCredit limit exceeded\n";
        else details += "\n";
        return details;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof CustomerAccount)) return false;

        CustomerAccount customerAccount = (CustomerAccount) obj;
        return customerAccount.accountNumber == this.accountNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + (accountNumber ^ (accountNumber >>> 32));
    }
}

class AccountApplication {
    final private HashMap<Integer, CustomerAccount> accounts = new HashMap<>();

    public CustomerAccount findByAccountNumber(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public CustomerAccount findAccount(CustomerAccount customerAccount) {
        return findByAccountNumber(customerAccount.getAccountNumber());
    }

    public CustomerAccount createAccount(int accountNumber) {
        if(!accounts.containsKey(accountNumber)) {
            CustomerAccount newAccount = new CustomerAccount(accountNumber);
            accounts.putIfAbsent(accountNumber, newAccount);
            return newAccount;
        }
        return null;
    }

    public CustomerAccount createAccount(
            int accountNumber,
            int initBalance,
            int creditLimit,
            int credits,
            int charges
    ) {
        if(!accounts.containsKey(accountNumber)) {
            CustomerAccount newAccount = new CustomerAccount(
                    accountNumber,
                    initBalance,
                    creditLimit,
                    credits,
                    charges
            );
            accounts.putIfAbsent(newAccount.getAccountNumber(), newAccount);
            return newAccount;
        }
        return null;
    }

    public CustomerAccount addAccount(CustomerAccount customerAccount) {
        if(accounts.putIfAbsent(customerAccount.getAccountNumber(), customerAccount) == null) {
            return customerAccount;
        } else return null;
    }

    public CustomerAccount updateAccount(CustomerAccount customerAccount) {
        if(accounts.containsKey(customerAccount.getAccountNumber())) {
            accounts.put(customerAccount.getAccountNumber(), customerAccount);
            return customerAccount;
        }
        return null;
    }

    public int calculateNewBalance(CustomerAccount customerAccount) {
        return findAccount(customerAccount).calculateNewBalance();
    }

    public int calculateNewBalance(int accountNumber) {
        return findByAccountNumber(accountNumber).calculateNewBalance();
    }

    public String getAccountDetails(int accountNumber) {
        CustomerAccount customerAccount = findByAccountNumber(accountNumber);
        return customerAccount.toString();
    }

    public String getAccountDetails(CustomerAccount customerAccount) {
        return getAccountDetails(customerAccount.getAccountNumber());
    }

    public String getAllAccountDetails() {
        StringBuilder details = new StringBuilder();
        for(CustomerAccount account : accounts.values()) {
            details.append(account.toString()).append("\n");
        }
        return details.toString();
    }
}


