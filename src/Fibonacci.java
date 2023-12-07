public class Fibonacci {
    /*
        This will print the fibonacci series upto the given index (n).
     */
    public static void solve(int n) {
        int t1 = 0, t2 = 1, tn;
        System.out.print(t1 + ", " + t2 + ", ");

        int index = 2;
        while (index < n) {
            tn = t1 + t2;
            t1 = t2;
            t2 = tn;
            index++;

            System.out.print(tn + ", ");
        }
    }
}
