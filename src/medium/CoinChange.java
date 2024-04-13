package medium;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int subAmount = 1; subAmount < amount + 1; subAmount++){
            for(int coin : coins){
                if(subAmount < coin){
                    continue;
                }
                dp[subAmount] = Math.min(dp[subAmount], 1 + dp[subAmount - coin]);
            }
        }
        if(dp[amount] > amount) return -1;
        return dp[amount];
    }
}
