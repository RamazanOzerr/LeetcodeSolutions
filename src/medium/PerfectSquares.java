package medium;

import java.util.Arrays;

public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for(int target = 1; target < n + 1; target++){
            for(int i = 1; i < target + 1; i++){
                int square = i * i;
                if(target < square) break;
                dp[target] = Math.min(dp[target], 1 + dp[target - square]);
            }
        }
        return dp[n];
    }
}
