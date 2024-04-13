public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int right = s.length() - 1;
        while(s.charAt(right) == ' '){ // remove the blanks in the end
            right--;
        }

        while(right >= 0){
            if(s.charAt(right) == ' '){
                return count;
            }
            count++;
            right--;
        }

        return count;
    }
}
