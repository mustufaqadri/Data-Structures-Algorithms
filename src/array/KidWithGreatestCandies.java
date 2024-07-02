package array;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestCandies {
    /*
        Problem Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    */
    public List<Boolean> solve(int[] candies, int extraCandies) {
        int maxCandies = 0;

        for (int i = 0; i < candies.length ; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length ; i++) {
            result.add((candies[i] + extraCandies) >= maxCandies);
        }

        return result;
    }
}
