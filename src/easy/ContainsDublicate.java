package easy;

import java.util.Arrays;

public class ContainsDublicate {

    // possible solutions
    /*
    1- use hashmap to get frequencies of each element
    2- sort the array and check if there is any element in a row

    I will use second option because my other submission is a solution of hashmap
    */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int curr;
        for(int i = 1; i < nums.length; i++){
            curr = nums[i];
            if(prev == curr) return true;
            prev = curr;
        }
        return false;
    }

}

