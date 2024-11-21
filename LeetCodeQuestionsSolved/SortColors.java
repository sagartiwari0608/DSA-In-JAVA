package LeetCodeQuestionsSolved;

public class SortColors {

    public static void main(String[] args) {
        SortColorsImplementation sol = new SortColorsImplementation();
        System.out.println(sol.sortColors(new int[] { 2, 0, 2, 1, 1, 0 }));
    }

}

class SortColorsImplementation {
    public int[] sortColors(int[] nums) {
        // Couting method. count all the zeros ones and twos then add them in same array
        // but in order.
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int index = 0;

        for (int i : nums) {
            if (i == 0)
                zeros++;
            else if (i == 1)
                ones++;
            else if (i == 2)
                twos++;
        }
        while (zeros > 0) {
            nums[index] = 0;
            index++;
            zeros--;
        }
        while (ones > 0) {
            nums[index] = 1;
            index++;
            ones--;
        }
        while (twos > 0) {
            nums[index] = 2;
            index++;
            twos--;
        }

        // This following solution is logically good but fails in certain cases for
        // example [1,2,0] this one. here it returns [1,0,2] hence we need to use the
        // other couting and adding method.
        // int low = 0;
        // int high = nums.length - 1;
        // int i = 0;
        // while (low < high && i <= high) {
        // if (nums[i] == 1) {
        // i++;
        // } else if (nums[i] == 0) {
        // int temp = nums[i];
        // nums[i] = nums[low];
        // nums[low] = temp;
        // low++;
        // i++;
        // } else if (nums[i] == 2) {
        // int temp = nums[i];
        // nums[i] = nums[high];
        // nums[high] = temp;
        // high--;
        // i++;
        // }
        // }
        return nums;
    }
}