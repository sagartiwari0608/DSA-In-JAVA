package DynamicProgramming;

public class Fibonacci {

    // this is top down or memoized solution
    static public int fibTopDownOrMemoized(int num, int[] dp) {
        if (num == 1 || num == 2)
            return 1;
        if (dp[num] != 0) {
            return dp[num];
        }
        int result = fibTopDownOrMemoized(num - 1, dp) + fibTopDownOrMemoized(num - 2, dp);
        dp[num] = result;

        return result;
    }

    // here we are filling up the base cases first in our array and then we start
    // from next value which is sum of these two base cases hence we are able to
    // code solution without acutally getting too many recursive calls.

    static public int fibBottomUpORTabular(int num) {
        int[] dp = new int[num + 1];
        if (num == 1 || num == 2)
            return 1;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[num];
    }

    public static void main(String[] args) {
        int num = 15;
        int[] dp = new int[num + 1];
        System.out.println(fibTopDownOrMemoized(num, dp));
        System.out.println(fibBottomUpORTabular(num));
    }
}
