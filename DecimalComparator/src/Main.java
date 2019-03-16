public class Main {
    public static void main(String[] args) {
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.175));
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(0,0));
        System.out.println("Values are equal? " + DecimalComparator.areEqualByThreeDecimalPlaces(52.1623, 62.1623));
    }

}
