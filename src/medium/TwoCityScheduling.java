package medium;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {

        //sort based on diff in costs in increasing order
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));

        int totalCost = 0;

        int n = costs.length;

        //send first n persons to city A
        for (int i = 0; i < n / 2; i++) {
            totalCost += costs[i][0];
        }

        //send next n persons to city B
        for (int i = n / 2; i < n; i++) {
            totalCost += costs[i][1];
        }

        return totalCost;
    }
}
