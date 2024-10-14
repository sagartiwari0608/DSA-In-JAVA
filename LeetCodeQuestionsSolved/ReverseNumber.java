package LeetCodeQuestionsSolved;

class Solution {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + lastDigit; // The above check is to confirm that if result at that stage is inside
                                              // the accepted range then only we should be proceeding with the further
                                              // with multiplication with 10.
            x = x / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}