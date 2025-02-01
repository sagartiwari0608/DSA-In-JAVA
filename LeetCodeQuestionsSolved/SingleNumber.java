package LeetCodeQuestionsSolved;

public class SingleNumber {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.singleNumber(new int[] { 1, 2, 3, 3, 2, 1, 4 }));
    }
}

class Solution1 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
}
