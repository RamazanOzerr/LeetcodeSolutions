package medium;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        int count = 0;

        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                String sub = s.substring(i, j + 1);
                if(isPalindrome(sub)) count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
