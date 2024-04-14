package easy;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {

        int leftCount = 0, rightCount = 0;
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while(leftIndex < rightIndex){
            if(isVowel(s.charAt(leftIndex))) leftCount++;
            if(isVowel(s.charAt(rightIndex))) rightCount++;
            leftIndex++;
            rightIndex--;
        }

        return leftCount == rightCount;
    }

    private boolean isVowel(char c){
        if(c == 'a' || c == 'e'|| c == 'i' || c ==  'o'|| c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        } return false;
    }
}
