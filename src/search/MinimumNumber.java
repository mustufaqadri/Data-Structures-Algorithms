package search;

public class MinimumNumber {
    /*
        This program will find the minimum number of the given array.
    */
    public static int solve(int[] arr) {
        int minNumber = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < minNumber) {
                minNumber = num;
            }
        }

        return minNumber;
    }
}
