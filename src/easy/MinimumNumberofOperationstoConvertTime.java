package easy;

import java.util.Arrays;

public class MinimumNumberofOperationstoConvertTime {
    public int convertTime(String current, String correct) {
        String[] currentList = current.split(":");
        String[] correctList = correct.split(":");
        int difference = (Integer.parseInt(correctList[0]) - Integer.parseInt(currentList[0])) * 60 + Integer.parseInt(correctList[1]) - Integer.parseInt(currentList[1]);


        int[] possibleTimes = {1, 5, 15, 60};
        int[] dp = new int[difference + 1];
        Arrays.fill(dp, difference + 1);
        dp[0] = 0;
        for(int subDiffer = 1; subDiffer < difference + 1; subDiffer++){
            for(int time : possibleTimes){
                if(subDiffer < time) continue;
                dp[subDiffer] = Math.min(dp[subDiffer], 1 + dp[subDiffer - time]);
            }
        }



        return dp[difference];
    }
}
