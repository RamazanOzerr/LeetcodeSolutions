package easy;

import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxDiff = -1;
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(!map.containsKey(currentChar)){
                map.put(currentChar, i);
            } else {
                maxDiff = Math.max(maxDiff, i - map.get(currentChar) - 1);
            }
        }
        return maxDiff;
    }
}
