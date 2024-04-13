package easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = getSumOfAllNumbersInRange(n);
        for(int num : nums){
            total -= num;
        }
        return total;
    }

    private static int getSumOfAllNumbersInRange(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
