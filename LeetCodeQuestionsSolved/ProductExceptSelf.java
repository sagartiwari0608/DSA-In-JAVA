package LeetCodeQuestionsSolved;

public class ProductExceptSelf {
    // the output that we are supposed to produce is similar to google question. but
    // here the condition was that time should be linear and no division operator to
    // be used.
    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProducts = nums.clone();
        int[] suffixProducts = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            prefixProducts[i] = prefixProducts[i] * prefixProducts[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i] * suffixProducts[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = suffixProducts[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = prefixProducts[i - 1];
            } else {
                result[i] = prefixProducts[i - 1] * suffixProducts[i + 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        productExceptSelf(nums);
    }
}
