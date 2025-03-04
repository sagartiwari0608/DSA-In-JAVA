package DynamicProgramming;

public class PaintHouses {
    public static void main(String[] args) {
        int[][] costs = {
                { 1, 5, 7 },
                { 5, 8, 4 },
                { 3, 2, 9 },
                { 1, 2, 4 }
        };

        int[][] dp = new int[costs.length][costs[0].length];
        // lets assign first house painting costs as that will have to be painted and
        // will not have any effect but will help us calculate further painting cost.
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        // now based on these we can calculate rest of the houses painting cost and
        // minimize it.

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        int min = Math.min(dp[3][0], dp[3][1]);
        min = Math.min(min, dp[3][2]);
        System.out.println(min);

    }
}
