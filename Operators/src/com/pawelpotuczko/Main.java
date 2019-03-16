package com.pawelpotuczko;

public class Main {

    public static void main(String[] args) {
	    double var1 = 20;
	    double var2 = 80;
	    double varSum = var1 + var2;
        System.out.println("varSum now is equal" + varSum);
	    varSum *= 25;
        System.out.println("varSum now is equal" + varSum);
        varSum %= 40;
        System.out.println("varSum now is equal" + varSum);

        if( varSum <= 20 ){
            System.out.println("Total was over the limit");
        }
    }
}
