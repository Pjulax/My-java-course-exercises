public class DigitsOperations {
    public static int sumDigits(int number){
        if(number > 9){
            int sum = 0;
            while(number>0) {
                sum += (number % 10);
                System.out.println((number%10) + " has been added");
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        if (temp > 0) {
            while (temp != 0) {
                reverse = reverse * 10 + (temp % 10);
                temp /= 10;
            }
        } else if (temp < 0) {
            temp *= -1;
            while (temp != 0) {
                reverse = reverse * 10 + (temp % 10);
                temp /= 10;
            }
            reverse *= -1;
        }
        if (number == reverse) {
            System.out.println( number + " is a palindrome");
            return true;
        }
        System.out.println(number + " isn't a palindrome");
        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;
        }
        int lastDigit = number % 10;
        int FirstDigit = 0;
        if( number > 0 ){
            do{
                FirstDigit = number % 10;
                number /= 10;
            }while(number != 0);
        }
        int sum = lastDigit + FirstDigit;
        System.out.println( FirstDigit + " + " + lastDigit + " = " + sum );
        return sum;

    }

    public static int getEvenDigitSum(int number){
        if(number >= 0){
            int sum = 0;
            while( number != 0 ) {
                if( ( number % 10 ) % 2 == 0 ) {
                    sum += (number % 10);
                    System.out.println((number % 10) + " has been added");
                }
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if( number1 >= 10 && number1 < 100
            && number2 >= 10 && number2 < 100)
        {
            int[][] digit = new int[2][2];
            for(int i = 0; i<2; i++){
                digit[0][i] = number1 % 10;
                digit[1][i] = number2 % 10;
                number1 /= 10;
                number2 /= 10;
            }
            boolean sharedDigits = false;
            for( int i = 0; i<2; i++){
                if( digit[0][i] == digit[1][0] || digit[0][i] == digit[1][1] ) {
                    sharedDigits = true;
                }
            }
            if(sharedDigits) {
                System.out.println("Shared number");
            } else {
                System.out.println("There wasn't any shared number");
            }
            return sharedDigits;
        }
        System.out.println("Invalid Value");
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int lastDig1, lastDig2, lastDig3;
            lastDig1 = num1 % 10;
            lastDig2 = num2 % 10;
            lastDig3 = num3 % 10;
            if( lastDig1 == lastDig2
                || lastDig1 == lastDig3
                || lastDig2 == lastDig3 )
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        return ( number >= 10 && number <= 1000 );
    }

    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 >= 10 && num2 >= 10){
            int remain = 0;
            if(num1 < num2){ // remain used as temporary variable
                remain = num1;
                num1 = num2;
                num2 = remain;
            }

            do{
                remain = num1 % num2;
                num1 = num2;
                num2 = remain;
            } while( remain != 0 );
            return num1; // num1 contains bigger number, so after modulo it has answer
        }
        return -1;
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 1; i <= number; i++){
                if( number % i == 0 ){
                    System.out.printf("%d ",i);
                }
            }
            System.out.printf("\n");
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        else{
            int sum = 0;
            for(int i = 1; i < number; i++){
                if( number % i == 0 ){
                    sum += i;
                }
            }
            return (sum == number);
        }
    }

}
