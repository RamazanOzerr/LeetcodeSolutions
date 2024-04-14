package easy;

public class SumOfSquaresOfSpecialElements {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 1; i <= n; i++){
            if(isSpecial(i, n)){
                sum += nums[i-1] * nums[i-1];
            }
        }
        return sum;
    }

    private boolean isSpecial(int i, int n){
        return n % i == 0;
    }
}
