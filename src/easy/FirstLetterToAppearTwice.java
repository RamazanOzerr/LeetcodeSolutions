package easy;

import java.util.HashMap;

public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                return c;
            }
            map.put(c, 1);
        }

        return 'a';

    }
}
