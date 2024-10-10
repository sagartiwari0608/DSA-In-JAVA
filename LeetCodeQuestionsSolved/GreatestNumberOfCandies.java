package LeetCodeQuestionsSolved;

import java.util.ArrayList;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {

        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= max);

        }
        System.out.println(result);

    }
}
