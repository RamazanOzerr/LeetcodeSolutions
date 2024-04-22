package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> widthList = new ArrayList<>();
        for(int i = 0; i < points.length; i++){
            widthList.add(points[i][0]);
        }
        Collections.sort(widthList);
        int prev = widthList.getFirst();
        int curr, max = Integer.MIN_VALUE;
        for(int i = 1; i < widthList.size(); i++){
            curr = widthList.get(i);
            max = Math.max(max, curr - prev);
            prev = curr;
        }

        return max;
    }
}
