package array;

public class ReverseArray {
    /*
        This program will reverse the given array.
    */
    public static void solve(int[] arr) {
        int start = 0, end = arr.length - 2;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
