package array;

public class ShuffleArray {
    /*
        Problem Link: https://leetcode.com/problems/shuffle-the-array/
    */
    public int[] solve(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0, xIndex = 0, yIndex = n;

        while (xIndex < n) {
            result[index] = nums[xIndex];
            index++;
            result[index] = nums[yIndex];
            index++;
            xIndex++;
            yIndex++;
        }

        return result;
    }
}
