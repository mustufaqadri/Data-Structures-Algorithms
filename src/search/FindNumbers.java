package search;

public class FindNumbers {
    /*
        Problem Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    */
    public static int solve(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static int countDigits(int num) {
        if (num < 0) {
            num *= -1;
        }

        return ((int) Math.log10(num)) + 1;
    }
}
