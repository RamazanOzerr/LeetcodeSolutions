import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        // 0 1 0 1 1

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            } else {
                count--;
            }

            if(map.containsKey(count)){
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }

        }
        return maxLength;

        /* BRUTE-FORCE SOLUTION
        int len = nums.length;
        int max = 0;
        for(int i = 0; i < len; i++){
            List<Integer> temp = new ArrayList<>();
            int zeroCount = 0;
            int oneCount = 0;
            temp.add(nums[i]);
            if(nums[i] == 0) zeroCount++;
            else oneCount++;

            for(int j = i + 1; j < len; j++){
                temp.add(nums[j]);
                if(nums[j] == 0) zeroCount++;
                else oneCount++;
                if(zeroCount == oneCount) max = Math.max(max, temp.size());
            }
        }
        return max;
        */
    }
}
