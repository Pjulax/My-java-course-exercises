public class LargestPrime {

    public static int getLargestPrime(int number){
        if (number < 2) {
            return -1;
        }
        int maxPrime = -1;
        boolean isPrime = false;

        for( int i = 2; i <= number; i++){

            if (number % i == 0){
                isPrime = true;
                // prime number checking
                for( int j = 2; j <= Math.sqrt(i); j++){

                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    maxPrime = i;
                }
            }
        }

        return maxPrime;
    }
}
