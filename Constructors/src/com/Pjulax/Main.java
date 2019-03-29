package com.Pjulax;

public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account();

        acc1.setNumber("0001");
        acc1.setBalance(250.25);
        acc1.setCustomerName("Joe Williams");
        acc1.setEmail("JoeWilliams@City.pl");
        acc1.setPhoneNumber(777111333);

        System.out.println(acc1.getNumber());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getCustomerName());
        System.out.println(acc1.getEmail());
        System.out.println(acc1.getPhoneNumber());

        acc1.depositFunds(123.87);
        acc1.withdrawFunds(123);
        acc1.withdrawFunds(280);

        System.out.println(acc1.getBalance());
    }
}
