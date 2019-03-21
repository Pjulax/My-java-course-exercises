package com.Pjulax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int counter = 0;
        int number = 0;
	    int sum = 0;
	    boolean hasNextInt;
	    while( counter < 10 ){
	        System.out.println("enter number #" + (counter+1) + ":");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                counter++;
                sum += number;
            } else{
                System.out.println("Invalid value");
            }

            scanner.nextLine();
        }
	    scanner.close();
        System.out.println("Sum of entered numbers is equal to " + sum);
    }
}
