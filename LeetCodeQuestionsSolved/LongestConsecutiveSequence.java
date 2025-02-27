package LeetCodeQuestionsSolved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int maxLength = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int length = 1;
                while (set.contains(i + length)) {
                    length++;
                }
                if (maxLength < length) {
                    maxLength = length;
                }
            }
        }
        System.out.println(maxLength);
        // this method doesn't scale well so need to modify with a similar method
        // HashMap<Integer, Boolean> map = new HashMap<>();
        // for (int i : nums) {
        // map.put(i, true);
        // }

        // for (int i : nums) {
        // if (map.containsKey(i - 1)) {
        // map.put(i, false);
        // }
        // }
        // int maxLength = 0;
        // // System.out.println("maxLength " + maxLength);
        // for (int i : nums) {
        // int length = 1;
        // if (map.get(i)) {
        // while (map.containsKey(i + length)) {
        // length++;
        // // System.out.println("Length " + length);
        // }
        // if (length > maxLength) {
        // maxLength = length;
        // }
        // }
        // }
        // System.out.println(maxLength);

    }
}
