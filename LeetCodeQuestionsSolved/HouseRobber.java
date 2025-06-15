package LeetCodeQuestionsSolved;

public class HouseRobber {
    // Now this is a Dp problem. where we have to use recursion (with or without
    // memo) or tabulation.
    // How did we arrive at the decision that this problem is a dp problem.
    // in this problem direct alternate solution didn't work. because robber has the
    // choice to skip as many as he wants but he has to make sure that he skips at
    // least once. means robber has choice and he can either rob the house or skip
    // that house. so lets see with code.
    // 1 more point to note if he skips one house after skipping alternate one he is
    // skipping at least 2 house.
    public int solveRec(int[] nums, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return nums[n];
        }
        int included = solveRec(nums, n - 2) + nums[n];
        int excluded = solveRec(nums, n - 1) + 0;
        return Math.max(included, excluded);
    }

    public int solveRecMemo(int[] nums, int n) {
        int[] dp = new int[nums.length];
        if (dp[n] != 0) {
            return dp[n];
        }
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return nums[n];
        }
        int included = solveRec(nums, n - 2) + nums[n];
        int excluded = solveRec(nums, n - 1) + 0;
        dp[n] = Math.max(included, excluded);
        return dp[n];
    }

    public int solveTab(int[] nums, int n) {
        int[] dp = new int[n + 1];

        dp[0] = nums[0];
        if (n == 1)
            return dp[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < n; i++) {
            int include = dp[i - 2] + nums[i];
            int exclude = dp[i - 1] + 0;
            dp[i] = Math.max(include, exclude);
        }
        return dp[n - 1];
    }

    public int rob(int[] nums) {

        // with Recursion now following solution works perfectly but its giving TLE for
        // longer arrays.
        // int n = nums.length;
        // int ans = solveRec(nums, n-1);
        // return ans;

        // Recursion with memoization.
        // int n = nums.length;
        // return solveRecMemo(nums, n-1);

        // dp with tabulation
        int n = nums.length;
        return solveTab(nums, n);

        // too much naive solution only alternate houses considered. and 40 out of 70
        // test cases passed.
        // int oddSum = 0;
        // int evenSum = 0;
        // for(int i =0; i<nums.length;i++){
        // if(i%2==0){
        // evenSum += nums[i];
        // }
        // else{
        // oddSum += nums[i];
        // }
        // }
        // return Math.max(oddSum,evenSum);
    }
}
