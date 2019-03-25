package com.Pjulax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE,
            min = Integer.MAX_VALUE;
        int temp;
        boolean hasNextInt;
//        boolean first = true;
        while(true){

            System.out.println("Enter number:");
            hasNextInt = scanner.hasNextInt();

            if(hasNextInt){

                temp = scanner.nextInt();
//                if(first){
//                    max = temp;
//                    min = temp;
//                }else {

                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }

//                }

            }else {
                System.out.println("Invalid number. Ending program");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Maximum value = " + max + ".");
        System.out.println("Minimum value = " + min + ".");
        scanner.close();
    }
}
