package com.Pjulax;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex = false;

    public Printer (int tonerLevel, boolean isDuplex){
        if(tonerLevel >= 1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.printedPages = 0;
    }

    public int tonerFill(int tonerAmount){
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if((this.tonerLevel + tonerAmount) > 100)
            {
                return -1;
            } else {
                this.tonerLevel += + tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pagesAmount){

        int pagesToPrint = pagesAmount;
        if (this.isDuplex){
            pagesToPrint = pagesToPrint/2 + pagesToPrint%2;
            System.out.println("Printing in duplex mode");
        }
        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
