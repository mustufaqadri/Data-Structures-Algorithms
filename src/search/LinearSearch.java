package search;

public class LinearSearch {
    /*
        This program will return index of the target if found else return -1.
    */
    public static int solve(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
