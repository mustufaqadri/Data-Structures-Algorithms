package search;

public class RichestCustomerWealth {
    /*
        Problem Link: https://leetcode.com/problems/richest-customer-wealth/description/
    */
    public int solve(int[][] accounts) {
        int maxWealth = 0;
        int wealth;

        for (int i = 0; i < accounts.length; i++) {
            wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = maxWealth < wealth ? wealth : maxWealth;
        }

        return maxWealth;
    }
}
