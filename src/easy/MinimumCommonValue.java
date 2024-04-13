package easy;

import java.util.HashSet;

public class MinimumCommonValue {
    // possible solution
    /*
    put the elements of num2 in a hashset
    loop the first array and check if it's valid in num2
    */
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums2){
            set.add(i);
        }

        for(int i : nums1){
            if(set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
