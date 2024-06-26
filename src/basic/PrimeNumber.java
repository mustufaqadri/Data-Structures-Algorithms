package basic;

public class PrimeNumber {
    /*
        This program will tell whether the given number is prime or not.
    */
    public static boolean solve(int num) {
        if (num <= 1) {
            return false;
        }

        int limit = num / 2;
        boolean isPrime = true;

        for (int i = 2; i < limit; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
