package com.classes;

public class bankAccount {

    private int bNumber;
    private double balance;
    private String customerName;
    private String email;
    private String pNumber;

    public bankAccount(int bNumber, double balance, String customerName, String email, String pNumber) {
        this.bNumber = bNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.pNumber = pNumber;
    }

    public int getbNumber() {
        return bNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setbNumber(int bNumber) {
        this.bNumber = bNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public void updateBalanceDeposit(int deposit) {

        this.balance += deposit;
        System.out.println("Deposit: " + deposit + " New Balance: " + this.balance);

    }

    public void updateBalanceWith(int withdrawal) {

        if (this.balance - withdrawal < 0) {
            System.out.println("Insufficient Funds");
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal: " + withdrawal + " New Balance: " + this.balance);

        }

    }
}
