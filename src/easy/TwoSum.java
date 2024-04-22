package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int remain = target - current;
            if(map.containsKey(remain)){
                return new int[] {map.get(remain), i};
            } else {
                map.put(current, i);
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        for(int i : res){
            System.out.println(i);
        }
    }
}
