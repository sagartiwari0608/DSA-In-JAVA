package LeetCodeQuestionsSolved;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        int index = 0;
        while (Math.pow(3, index) <= n) {

            if (Math.pow(3, index) == n) {
                System.out.println(index);
                return true;
            }
            index++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
