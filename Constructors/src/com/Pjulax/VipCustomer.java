package com.Pjulax;

public class VipCustomer {
    String customersName;
    double creditLimit;
    String customersEmailAdress;


    public VipCustomer(){
        this("Customer", 5000.0, "customer@email.com");
    }

    public VipCustomer(String customerName, String customersEmailAdress){
        this(customerName, 5000.0 , customersEmailAdress);
    }

    public VipCustomer(String customersName, double creditLimit, String customersEmailAdress) {
        this.customersName = customersName;
        this.creditLimit = creditLimit;
        this.customersEmailAdress = customersEmailAdress;
    }


    public String getCustomersName() {
        return customersName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomersEmailAdress() {
        return customersEmailAdress;
    }
}
