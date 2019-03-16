public class SumOddRange {
    public static boolean isOdd (int number){
        return (number > 0) && ((number % 2) == 1);
    }

    public static int sumOdd (int start, int end){
        if(start > 0 && end >= start) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

}
