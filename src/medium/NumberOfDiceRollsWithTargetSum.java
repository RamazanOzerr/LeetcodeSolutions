package medium;

public class NumberOfDiceRollsWithTargetSum {
    Integer[][] dp;
    public int numRollsToTarget(int n, int k, int target) {
        if (target > n*k){
            return 0;
        }
        dp = new Integer[n+1][target+1];
        return dfs(n, k, target);
    }

    public int dfs(int n, int k, int target){
        if (target == 0 && n == 0){
            return 1;
        }
        if (target < 0 || n == 0){
            return 0;
        }
        if (dp[n][target] != null){
            return dp[n][target];
        }
        dp[n][target] = 0;
        for (int i=1; i<=k; i++){
            dp[n][target] = (dp[n][target]+dfs(n-1, k, target-i))%1000000007;
        }
        return dp[n][target];
    }
}
