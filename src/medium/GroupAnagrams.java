package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        List<List<String>> resList = new ArrayList<>();
        for(String currStr : strs){
            HashMap<Character, Integer> tempMap = new HashMap<>();
            for(char c : currStr.toCharArray()){
                if(tempMap.containsKey(c)){
                    int tempVal = tempMap.get(c);
                    tempMap.put(c, ++tempVal);
                } else {
                    tempMap.put(c, 1);
                }
            }

            List<String> tempValList;
            if(map.containsKey(tempMap)){
                tempValList = map.get(tempMap);
            } else {
                tempValList = new ArrayList<>();
            }

            tempValList.add(currStr);
            map.put(tempMap, tempValList);
        }

        for(HashMap<Character, Integer> keyMap : map.keySet()){
            resList.add(map.get(keyMap));
        }

        return resList;

    }
}
