package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i : nums1){
            seen.add(i);
        }

        List<Integer> res = new ArrayList<>();
        HashSet<Integer> seen2 = new HashSet<>();

        for(int i : nums2){
            if(seen.contains(i) && !seen2.contains(i)){
                res.add(i);
                seen2.add(i);
            }
        }

        return convertToArray(res);

    }
    private static int[] convertToArray(List<Integer> list){
        int size = list.size();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
