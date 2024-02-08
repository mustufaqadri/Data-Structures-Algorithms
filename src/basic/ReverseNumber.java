package basic;

public class ReverseNumber {
    /*
        This program will reverse the given number.
    */
    public static int solve(int number) {
        int remainder;
        int reversedNumber = 0;

        while (number > 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return reversedNumber;
    }
}
