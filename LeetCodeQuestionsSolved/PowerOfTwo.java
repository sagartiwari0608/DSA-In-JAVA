package LeetCodeQuestionsSolved;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                result++;
                if (result > 1) {
                    return false;
                }
            }
            n >>= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
