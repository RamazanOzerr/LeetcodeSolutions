package medium;

public class MinimumTimeToMakeRopeColorful {
    /*
    choose the one with the lest neededTime, but also when you remove it, it's prev and next shouldnt
    be the same
    */
    public int minCost(String colors, int[] neededTime) {

        int n = colors.length();
        int left = 0;
        int result = 0;

        for (int right = 1; right < n; right++) {
            if (colors.charAt(left) == colors.charAt(right)) {
                if (neededTime[left] < neededTime[right]) {
                    result += neededTime[left];
                    left = right;
                } else {
                    result += neededTime[right];
                }
            } else {
                left = right;
            }
        }
        return result;


    }
}
