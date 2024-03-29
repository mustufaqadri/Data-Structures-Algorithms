package basic;

public class Fibonacci {
    /*
        Problem Link: https://leetcode.com/problems/fibonacci-number/description/
    */
    public static int solve(int n) {
        if (n <= 1) return n;

        int t1 = 0, t2 = 1, tn = 0;
        int index = 1;

        while (index < n) {
            tn = t1 + t2;
            t1 = t2;
            t2 = tn;
            index++;
        }

        return tn;
    }
}
