public class FindTheDublicateNumber {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        do{  // find the first intersaction of pointers
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // once we find the intersaction, the lenght of that intersaction to the beginning node of the cycle
        // will be equal to length of first node to the beginning of the cycle
        // so if we define a new slow pointer in the first node and find the intersaction of it with the old slow node
        // it will be the beginning of the cycle, which in this case is the result of this problem
        int newSlow = nums[0];
        while(newSlow != slow){
            newSlow = nums[newSlow];
            slow = nums[slow];
        }
        return newSlow;

    }
}
