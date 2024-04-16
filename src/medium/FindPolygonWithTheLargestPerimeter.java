package medium;

import java.util.Arrays;

public class FindPolygonWithTheLargestPerimeter {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        for (int i = n - 1; i >= 2; i--) {

            if(nums[i] < sum - nums[i]){
                return sum;
            }
            sum -= nums[i];
        }

        return -1;


    }
}
