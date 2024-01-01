package basics;

public class ArmstrongNumber {
    /*
        This program will tell whether the given number is armstrong or not.
    */
    public static boolean solve(int num) {
        int tempNum = num;
        int digit;
        int sum = 0;

        while (tempNum > 0) {
            digit = tempNum % 10;
            sum += (digit * digit * digit);
            tempNum /= 10;
        }

        return num == sum;
    }
}
