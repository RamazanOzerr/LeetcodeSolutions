package easy;

public class ClimbingStairs {
    // FIBONACCI

    public int climbStairs(int n) {

        int first = 1, second = 1;
        for(int i = 0; i < n - 1; i++){
            int temp = first;
            first += second;
            second = temp;
        }
        return first;

    }
}
