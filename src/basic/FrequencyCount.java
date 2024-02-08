package basic;

public class FrequencyCount {

    /*
        This program will count the occurrences of a digit in the given number.
     */
    public static int solve(int number, int digit) {
        int remainder;
        int count = 0;

        while (number > 0) {
            remainder = number % 10;
            if (remainder == digit) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
