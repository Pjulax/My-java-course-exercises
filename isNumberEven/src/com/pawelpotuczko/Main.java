package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isNumberEven(5));
        System.out.println(isNumberEven(3));
        System.out.println(isNumberEven(-2));
        System.out.println(isNumberEven(82736));
        System.out.println(isNumberEven(-1527276));
        System.out.println(isNumberEven(-1827));
        System.out.println(isNumberEven(0));
    }

    public static boolean isNumberEven(int value){
        return value%2==0;
    }
}
