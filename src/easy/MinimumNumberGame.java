package easy;

import java.util.Arrays;

public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int len = nums.length;
        int[] arr = new int[len];
        int curr;
        int index = 0;
        for(int i = 1; i < len; i = i + 2){
            curr = nums[i];
            arr[index++] = curr;
            arr[index++] = prev;
            if(i + 1 < len){
                prev = nums[i+1];
            }
        }
        return arr;
    }
}
