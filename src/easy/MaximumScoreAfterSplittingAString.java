package easy;

public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {

        int max = Integer.MIN_VALUE;
        int len = s.length();
        for(int i = 1; i < len; i++){
            String leftString = s.substring(0, i);  // get left substring
            String rightString = s.substring(i, len);  // get right substring
            int left = getNumberOfZeros(leftString);  // cal the num of 0s in the left
            int right = getNumberOfOnes(rightString);  // cal the num of 1s in the right
            max = Math.max(max, left + right);  // update max value so far
        }

        return max;
    }

    private int getNumberOfZeros(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                count++;
            }
        }
        return count;
    }

    private int getNumberOfOnes(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }
        return count;
    }
}
