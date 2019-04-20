package com.Pjulax;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(75, true);
        System.out.println("You printed " + printer.printPages(15) + " pages now & totaly " + printer.getPrintedPages());
        System.out.println("You filled up to " + printer.tonerFill(15) + "% of toner level");
        System.out.println("You filled up to " + printer.tonerFill(35) + "% of toner level");
        System.out.println("You printed " + printer.printPages(35) + " pages now  & totaly " + printer.getPrintedPages());

    }
}