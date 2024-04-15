package easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        String newS = builder.toString();
        int right = newS.length() - 1;
        while(left < right){
            if(newS.charAt(left) != newS.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
