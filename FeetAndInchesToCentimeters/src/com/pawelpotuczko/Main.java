package com.pawelpotuczko;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(48);
        calcFeetAndInchesToCentimeters(46);
        calcFeetAndInchesToCentimeters(-46);
        calcFeetAndInchesToCentimeters(0);
        calcFeetAndInchesToCentimeters(10,6);
        calcFeetAndInchesToCentimeters(-1,8);
        calcFeetAndInchesToCentimeters(-1,13);
        calcFeetAndInchesToCentimeters(0,11);
        calcFeetAndInchesToCentimeters(5,-1);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if( feet < 0 || (inches < 0 || inches > 12) ){
            System.out.println("Invalid feets or inches parameter!");
            return -1;
        }
        double centimeters = (feet * 12 ) * 2.54;
        centimeters += inches * 2.54;
        System.out.println( feet + " feet + " + inches + " inches = " + centimeters + " centimeters");
        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters (int inches){
        if( inches < 0 ) {
            System.out.println("Invalid inches parameter!");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
