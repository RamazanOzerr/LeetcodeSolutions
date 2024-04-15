package medium;

import java.util.HashMap;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public int minOperations(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                int tempI = map.get(i);
                map.put(i, ++tempI);
            } else {
                map.put(i, 1);
            }
        }

        int ans = 0;
        for (int c: map.values()) {
            if (c == 1) {
                return -1;
            }
            ans += (int) Math.ceil((double) c / 3);
        }
        return ans;
    }
}
