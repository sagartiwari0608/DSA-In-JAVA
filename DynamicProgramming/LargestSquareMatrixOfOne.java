package DynamicProgramming;

public class LargestSquareMatrixOfOne {

    public static int findLargestSquare(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];
        int result = 0;
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j > 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length) {
                    dp[i][j] = nums[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = nums[i][j];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = nums[i][j];
                } else if (nums[i][j] == 0) {
                    dp[i][j] = nums[i][j];
                } else {
                    int min = Math.min(dp[i][j + 1], dp[i + 1][j]);
                    min = Math.min(dp[i + 1][j + 1], min);
                    dp[i][j] = min + 1;
                    if (dp[i][j] > result) {
                        result = dp[i][j];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0 },
                { 0, 1, 1, 1, 1, 0 },
                { 0, 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 1, 1 }
        };
        System.out.println(findLargestSquare(matrix));
    }
}