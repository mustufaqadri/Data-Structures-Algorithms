package search;

public class Array2DSearch {
    /*
        This program will search and return the index of the target element in the given 2D Array.
     */
    public static int[] solve(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] ==  target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
