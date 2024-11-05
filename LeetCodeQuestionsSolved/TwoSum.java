package LeetCodeQuestionsSolved;

import java.util.HashMap;
import java.util.Map;

// this is the optimised solution as we know maps have search time of O(1) thats how we reduced our search time and reduced the overall complexity. 

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetSum = target - nums[i];
            if (newMap.containsKey(targetSum)) {
                return new int[] { newMap.get(targetSum), i };
            } else {
                newMap.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
        // here if we see target is 5 then first map is empty then it will see if 5 - 1(
        // first item here) is equal to 4 if 4 is present in the map then we found both
        // numbers. if not then we add that number (1) into the map . and repeat process
        // untill one of them matches.
    }

}
