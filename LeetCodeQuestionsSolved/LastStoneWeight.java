package LeetCodeQuestionsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// incompleteeeeee

public class LastStoneWeight {
    public static void main(String[] args) {
        // Integer[] stones = new Integer[] { 2, 4, 7, 8, 1, 1 };
        // List<Integer> list = new ArrayList<>(Arrays.asList(stones));
        // list.sort((a, b) -> a - b);
        // for (int i = stones.length - 1; i > 0; i++) {
        // int max = list.remove(list.size() - 1);
        // // list.
        // list.set(list.size() - 1, max - list.get(list.size() - 1));
        // }
        // System.out.println(list);
        // System.out.println(list.toString());
        // return list.get(0);
        lastStoneWeightII();
    }

    public static int lastStoneWeightII() {

        int[] stones = new int[] { 2, 4, 7, 8, 1, 1 };
        Arrays.sort(stones);
        for (int i = stones.length - 1; i > 0; i--) {
            if (i != 1) {
                stones[i - 1] = stones[i] - stones[i - 1];
            }
        }
        for (int i : stones) {
            System.out.println(i);
        }

        return -1;
    }

}
