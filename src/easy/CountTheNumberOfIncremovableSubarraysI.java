package easy;

public class CountTheNumberOfIncremovableSubarraysI {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int result = 0;

        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                if (isIncremovable(nums, left, right)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean isIncremovable(int[] nums, int left, int right) {
        int[] temp = new int[nums.length - (right - left + 1)];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < left || i > right) {
                temp[index++] = nums[i];
            }
        }

        return isStrictlyIncreasing(temp);
    }

    private boolean isStrictlyIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
