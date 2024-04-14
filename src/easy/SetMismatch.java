package easy;

import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length + 1];

        Arrays.fill(arr, 0);

        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }

        int missing = -1;
        int duplicate = -1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){
                missing = i;
            }
            if(arr[i] > 1){
                duplicate = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}
