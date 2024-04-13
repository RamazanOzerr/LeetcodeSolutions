package medium;

import java.util.HashMap;

public class CustomSortString {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        StringBuilder builder = new StringBuilder();
        for(char c : order.toCharArray()){
            if(map.containsKey(c)){
                for(int i = 0; i < map.get(c); i++){
                    builder.append(c);
                }
                map.remove(c);
            }
        }

        for(char key : map.keySet()){
            for(int i = 0; i < map.get(key); i++){
                builder.append(key);
            }
        }
        return builder.toString();

    }
}
