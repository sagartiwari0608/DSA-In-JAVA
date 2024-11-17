package LeetCodeQuestionsSolved;

public class SortColors {

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.sortColors(new int[] { 1, 0, 2, 1, 0, 0 }));
    }

}

class Solution {
    public int[] sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        while (low < high && i <= high) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                low++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
                i++;
            }
        }
        return nums;
    }
}