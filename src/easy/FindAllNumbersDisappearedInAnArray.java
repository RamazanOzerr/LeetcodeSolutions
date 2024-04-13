package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!seen.contains(i)) res.add(i);
        }
        return res;
    }
}
