package search;

public class StringSearch {
    /*
        This program will tell whether a character is present in the given string or not.
    */
    public static int solve(String str, char ch) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }

        return -1;
    }

}
