package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                int temp = map.get(c);
                map.put(c, ++temp);
            } else {
                map.put(c, 1);
            }
        }

        TreeMap<Integer, List<Character>> sortedMap = new TreeMap<>();
        for(char key : map.keySet()){
            int val = map.get(key);
            List<Character> list;
            if(sortedMap.containsKey(val)){
                list = sortedMap.get(val);
            } else {
                list = new ArrayList<>();
            }
            list.add(key);
            sortedMap.put(val, list);
        }

        StringBuilder builder = new StringBuilder();
        for(int key : sortedMap.keySet()){
            List<Character> list = sortedMap.get(key);
            for(char c : list){
                for(int i = 0; i < key; i++){
                    builder.append(c);
                }
            }
        }

        return reverseString(builder.toString());
    }


    private String reverseString(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
