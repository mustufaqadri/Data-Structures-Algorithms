package search;

public class RangeSearch {
    /*
        This program will search an element within the given range.
    */

    public static int solve(int[] arr, int start, int end, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
