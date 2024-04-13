package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
    public List<String> removeAnagrams(String[] words) {
        HashMap<HashMap<Character, Integer>, String> mainMap = new HashMap<>();
        List<String> resList = new ArrayList<>();
        resList.add(words[0]);
        for(int i = 1; i < words.length; i++){
            String currentWord = words[i];
            String prevWord = words[i-1];
            HashMap<Character, Integer> currentMap = getMap(currentWord);
            HashMap<Character, Integer> prevMap = getMap(prevWord);

            if(!isEqual(currentMap, prevMap)){
                resList.add(currentWord);
            }
        }
        return resList;
    }

    private boolean isEqual(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
        if(map1.size() != map2.size()) return false;
        for(char key : map1.keySet()){
            if(!map2.containsKey(key)){
                return false;
            }
            if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }

    private HashMap<Character, Integer> getMap(String word){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            if(map.containsKey(c)){
                int temp = map.get(c);
                map.put(c, ++temp);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
