class Solution
{
    public int solveWordWrap (int[] nums, int k)
    {
        int n = nums.length;
        int[] dp = new int[n];
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            int length = 0;
            for (int j = i; j < n; j++) {
                length += nums[j];
                if (length <= k) {
                    if (j == n - 1) {
                        cost[i][j] = 0;
                    } else {
                        cost[i][j] = (k - length) * (k - length);
                    }
                } else {
                    cost[i][j] = Integer.MAX_VALUE;
                }
                length++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cost[i][n - 1];
            for (int j = n - 1; j > i; j--) {
                if (cost[i][j - 1] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], cost[i][j - 1] + dp[j]);
                }
            }
        }
        return dp[0];
    }
}
