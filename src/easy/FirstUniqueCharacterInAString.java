package easy;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                int temp = map.get(c);
                map.put(c, ++temp);
            } else {
                map.put(c, 1);
            }
        }

        char curr;
        for(int i = 0; i < s.length(); i++){
            curr = s.charAt(i);
            if(!map.containsKey(curr)) return -1;
            if(map.get(curr) == 1) return i;
        }
        return -1;
    }
}
