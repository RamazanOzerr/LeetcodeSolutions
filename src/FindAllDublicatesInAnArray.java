import java.util.ArrayList;
import java.util.List;

public class FindAllDublicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        // O(n) runtime, O(n) space
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            nums[Math.abs(i) - 1] *= -1;
            if(nums[Math.abs(i) - 1] > 0){
                res.add(Math.abs(i));
            }
        }
        return res;

    }
}
