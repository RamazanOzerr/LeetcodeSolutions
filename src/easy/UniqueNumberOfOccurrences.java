package easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                int temp = map.get(i);
                map.put(i, ++temp);
            } else {
                map.put(i, 1);
            }
        }

        HashSet<Integer> seen = new HashSet<>();
        for(int key : map.keySet()){
            int currentValue = map.get(key);
            if(seen.contains(currentValue)) return false;
            seen.add(currentValue);
        }
        return true;
    }
}
