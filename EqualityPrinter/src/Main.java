public class Main {
    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,2,3);
        IntEqualityPrinter.printEqual(1,2,2);
        IntEqualityPrinter.printEqual(2,1,2);
        IntEqualityPrinter.printEqual(5,5,-1);
        IntEqualityPrinter.printEqual(5,-5,1);
        IntEqualityPrinter.printEqual(-5,5,-1);
    }
}
