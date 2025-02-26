package LeetCodeQuestionsSolved;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, true);
        }

        for (int i : nums) {
            if (map.containsKey(i - 1)) {
                map.put(i, false);
            }
        }
        int maxLength = 0;
        // System.out.println("maxLength " + maxLength);
        for (int i : nums) {
            int length = 1;
            if (map.get(i)) {
                while (map.containsKey(i + length)) {
                    length++;
                    // System.out.println("Length " + length);
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        // System.out.println(maxLength);

    }
}
