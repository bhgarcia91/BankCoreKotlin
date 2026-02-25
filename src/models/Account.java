package models;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(String accountNumberCustomer, Customer customer, float balance) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}