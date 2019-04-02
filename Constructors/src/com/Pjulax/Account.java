package com.Pjulax;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email,
                   String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getNumber(){
        return this.number;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        if( depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println(depositAmount + "$ succesfully added to your account account balance.");
        }
    }

    public void withdrawFunds(int withdrawalAmount){
        if(this.balance - withdrawalAmount >= 0) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawed " + withdrawalAmount + "$.");
        } else {
            System.out.println("You have insufficient funds, you can't withdraw that amount of money.");
        }
    }
}
