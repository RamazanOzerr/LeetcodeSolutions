package hard;

import java.util.Arrays;

public class MinimumDifficultyOfAJobSchedule {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;

        if (n < d) {
            return -1; // Cannot schedule the jobs in d days
        }

        int[][] dp = new int[n + 1][d + 1];

        // Initialize the dp array with a large value
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= d; k++) {
                int maxDifficulty = 0;
                for (int j = i; j > 0; j--) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[j - 1]);
                    dp[i][k] = Math.min(dp[i][k], dp[j - 1][k - 1] + maxDifficulty);
                }
            }
        }

        return dp[n][d] == Integer.MAX_VALUE / 2 ? -1 : dp[n][d];
    }
}



