package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    // possible solutions
    /*
    1- using hashmap to store the frequencies of each element in both strings and compare them
    2- sort the elements of strings and compare

    I will use the second solution since my first submission used hashmap
    */

    public boolean isAnagramSolution1(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        int sLen = sArr.length;
        int tLen = tArr.length;
        if(sLen != tLen) return false;
        for(int i = 0; i < sLen; i++){
            if(sArr[i] != tArr[i]) return false;
        } return true;
    }

    public boolean isAnagramSolution2(String s, String t){

        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        for(char c : t.toCharArray()){
            if(tMap.containsKey(c)){
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        for(char c : s.toCharArray()){
            if(sMap.containsKey(c)){
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }

        if(tMap.size() != sMap.size()){
            return false;
        }

        for(char key : tMap.keySet()){
            if(!sMap.containsKey(key)){
                return false;
            }
            if(tMap.get(key) != sMap.get(key)){
                return false;
            }
        }

        return true;

    }
}
