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
            if (num % 2 == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static boolean solveQuick(int num) {
        if (num <= 1) {
            return false;
        }

        boolean isPrime = true;
        int factor = 2;
        while (factor * factor <= num) {
            if (num % factor == 0) {
                isPrime = false;
                break;
            }
            factor++;
        }

        return isPrime;
    }
}
