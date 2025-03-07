package LeetCodeQuestionsSolved;

public class CountingBits {

    public static int hammingWeight(int n) {
        int result = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                result++;
            }
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(14));
    }
}
