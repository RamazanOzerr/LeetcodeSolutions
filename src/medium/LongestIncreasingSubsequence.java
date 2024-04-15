package medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int[] dp = new int[n];
        int len = 0;
        for(int num : nums){
            int index = Arrays.binarySearch(dp, 0, len, num);
            if(index < 0){
                index = -(index + 1);
            }
            dp[index] = num;
            if(index == len){
                len++;
            }
        }
        return len;
    }
}
