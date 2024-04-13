public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        // time: O(n), space: O(n) solution
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        int i = 1;
        while(true){
            if(!seen.contains(i)){
                return i;
            }
            i++;
        }

    }
}
