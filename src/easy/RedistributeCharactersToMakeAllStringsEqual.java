package easy;

import java.util.HashMap;

public class RedistributeCharactersToMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(String s : words){
            for(char c : s.toCharArray()){
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        int len = words.length;
        for(char key : map.keySet()){
            if(map.get(key) % len != 0){
                return false;
            }
        }
        return true;
    }
}
